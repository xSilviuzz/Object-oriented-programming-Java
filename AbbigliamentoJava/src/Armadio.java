import java.util.*;

public interface Armadio<C extends Capo> extends Iterable<C>{

    void aggiungi(C capo);

    default boolean rimuovi(C capo){
        Iterator<C> it = iterator();

        while(it.hasNext()){
            C curr = it.next();
            if(curr.equals(capo)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    List<C> scomparto(int modulo, int scomparto);

    List<C> modulo(int modulo);

    default List<C> cerca(String keyword){
        if(keyword == null || keyword.isBlank()) throw new NullPointerException();
        if(keyword.length() > 10) throw new IllegalArgumentException();
        if(!keyword.matches("[a-zA-Z0-9]+")) throw new IllegalArgumentException();

        List<C> ret = new ArrayList<C>();
        for(C c: this){
            if(c.codice().val().contains(keyword) || c.descrizione().val().contains(keyword)){
                ret.add(c);
            }
        }
        return ret;
    }

    default double valoreTotale(){
        double sum = 0;
        for(C c: this){
            sum += c.prezzo().val();
        }
        return sum;
    }

    boolean verificaStandard();

}
