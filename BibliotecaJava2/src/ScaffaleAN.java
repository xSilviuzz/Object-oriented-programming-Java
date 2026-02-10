import java.util.*;

public class ScaffaleAN<D extends Documento> extends AbstractScaffale<D>{

    private Object[] documenti;
    private int size;
    private TipoDocumento<?> tipo;
    public ScaffaleAN(int capacitaMassima, String identificativo, TipoDocumento<?> tipo) {
        super(capacitaMassima, identificativo);
        this.documenti = new Object[capacitaMassima];
        this.size = 0;
        this.tipo = tipo;
    }

    @Override
    public void aggiungi(D doc){
        if(doc == null) throw new NullPointerException();
        if(!doc.getTipo().equals(tipo)) throw new IllegalArgumentException();
        if(size >= capacitaMassima()) throw new IllegalArgumentException();

        int pos = trovaPosizione(doc);

        for(int i = size; i > pos; i--){
            documenti[i] = documenti[i-1]; // i coincide con size che coincide con un posto vuoto
        }
        documenti[pos] = doc;
        size++;
    }


    private int trovaPosizione(D doc){
        for(int i = 0; i < size; i++){
            D curr = (D) documenti[i];
            if(curr.compareTo(doc) > 0){
                return i;
            }

        }
        return size;    //inserisci alla fine se non trovi nessun elemento
    }

    @Override
    public Iterator<D> iterator(){
        return new Iterator<D>(){
            int index = 0;
            int ultimoRit = -1;
            boolean removable = false;
            @Override
            public boolean hasNext(){
                return index < size;
            }
            @Override
            public D next(){
                if(!hasNext()) throw new NoSuchElementException();
                D curr = (D) documenti[index];
                ultimoRit = index;
                index++;
                removable = true;
                return curr;
            }
            @Override
            public void remove(){
                if(!removable) throw new IllegalArgumentException();
                for(int i = ultimoRit; i < size - 1; i++){
                    documenti[i] = documenti[i+1];
                }
                documenti[size - 1] = null;
                size--;
                index = ultimoRit;
                removable = false;
            }
        };
    }
}
