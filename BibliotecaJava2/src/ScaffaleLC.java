import java.util.*;

public class ScaffaleLC<D extends Documento> extends AbstractScaffale<D>{

    private final TipoDocumento<?> tipo;

    public ScaffaleLC(int capacitaMassima, String identificativo, TipoDocumento<?> tipo) {
        super(capacitaMassima, identificativo);
        this.tipo = tipo;
    }

    public TipoDocumento<?> getTipo() {
        return tipo;
    }

    public class Nodo{
        Nodo next;
        D info;
        public Nodo(Nodo next, D info){
            this.next = next;
            this.info = info;
        }
    }

    private int size = 0;
    private Nodo head = null;

    public void aggiungi(D doc){
        if(doc == null) throw new NullPointerException();
        if(!doc.getTipo().equals(tipo)) throw new IllegalArgumentException();
        if(size >= capacitaMassima()) throw new IllegalArgumentException();

        Nodo daAgg = new Nodo(null, doc);
        if(head == null || head.info.compareTo(doc) > 0){
            daAgg.next = head;
            head = daAgg;
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.next.info.compareTo(doc) < 0){
                curr = curr.next;
            }
            daAgg.next = curr.next;
            curr.next = daAgg;
        }
    size++;
    }

    @Override
    public Iterator<D> iterator(){
        return new Iterator<D>(){
            boolean removable = false;
            Nodo curr = null;
            Nodo prec = null;

            @Override
            public boolean hasNext(){
                if(curr == null){
                    return head != null;
                }else{
                    return curr.next != null;
                }
            }

            @Override
            public D next(){
                if(!hasNext()) throw new NoSuchElementException();
                removable = true;
                if(curr == null){
                    curr = head;
                }else{
                    prec = curr;
                    curr = curr.next;
                }
                return curr.info;
            }

            @Override
            public void remove(){
                if(!removable) throw new IllegalArgumentException();
                if(prec == null){
                    head = curr.next;
                }else{
                    prec.next = curr.next;
                }
                size--;
                removable = false;
                curr = prec;
            }
        };
    }
}
