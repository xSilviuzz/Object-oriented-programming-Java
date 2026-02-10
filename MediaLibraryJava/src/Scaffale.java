import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Scaffale<S extends Supporto> extends Iterable<S>{

    void add(S item);

    default boolean remove(S item){
        Iterator<S> jamu = iterator();
        while (jamu.hasNext()){
            if(item.equals(jamu.next())){
                jamu.remove();
                return true;
            }
        }
        return false;
    }

    List<S> mensola(int index);

    default List<S> cerca(String keyword){
        List<S> ret = new ArrayList<>();
        for(S s : this){
            if(s.getTitolo().titolo().contains(keyword)){
                ret.add(s);
            }
        }
        return ret;
    }
}
