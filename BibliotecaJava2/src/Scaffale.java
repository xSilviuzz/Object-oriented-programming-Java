import java.util.*;

public interface Scaffale<D extends Documento> extends Iterable<D>{

    void aggiungi(D doc);

    default boolean rimuovi(D doc){
        Iterator<D> it = iterator();
        while(it.hasNext()){
            D curr = it.next();
            if(curr.equals(doc)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    default D getDocumento(int index){
        Iterator<D> it = iterator();
        int count = 0;
        while(it.hasNext()){
            D curr = it.next();
            if(count == index) return curr;
            count++;
        }
        throw new IndexOutOfBoundsException("Indice non valido");
    }

    default List<D> ricerca(String parola){
        if(parola == null || parola.isBlank()) throw new NullPointerException();
        if(!parola.matches("[a-zA-Z0-9]{1,15}")) throw new IllegalArgumentException();
        List<D> ret = new ArrayList<D>();
        for(D d : this){
            String tit = d.getTitolo().val();
            String cod = d.getCodice().val();
            String aut = d.getAutore().val();

            if(tit.contains(parola) || cod.contains(parola) || aut.contains(parola)){
                ret.add(d);
            }
        }
        return ret;
    }

    int capacitaMassima();

    default boolean isFull(){
        int max = this.capacitaMassima();
        int count = 0;
        for(D d : this){
            count++;
        }
        if(count == max) return true;
        return false;
    }

}
