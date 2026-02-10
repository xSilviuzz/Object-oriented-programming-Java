import java.util.ArrayList;
import java.util.List;

public interface AreaGestione<A extends AccessoPS> extends Iterable<A>{

    void inserisci(A item);
    boolean rimuovi(A item);
    List<A> stanza(int index);
    default List<A> cerca(String keyword){

        if(keyword == null) throw new NullPointerException();
        if(!keyword.matches("^[A-Za-z0-9]{1,10}$")) throw new IllegalArgumentException("Nome non valido");

        List<A> ret = new ArrayList<A>();
        for(A a : this){
           if(a.getPaziente().val().contains(keyword)) ret.add(a);
        }
        return ret;
    }
}
