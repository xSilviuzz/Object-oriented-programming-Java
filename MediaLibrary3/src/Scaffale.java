import java.util.*;

public interface Scaffale<S extends Supporto> extends Iterable<S> {

    void add(S item);

    default boolean remove(S item){
        Iterator<S> it = iterator();
        while(it.hasNext()){
            S curr = it.next();
            if(curr.equals(item)){
                it.remove();
                return true;
            }
        }
        return false;
    }


    List<S> mensola(int index);


    default List<S> cerca(String keyword){
        if(!keyword.matches("[0-9a-bA-B]{0,10}")) throw new IllegalArgumentException();
        List<S> ret = new ArrayList<S>();
        for(S s : this){
            if(s.getTitolo().val().contains(keyword)){
                ret.add(s);
            }
        }
        return ret;
    }

}
