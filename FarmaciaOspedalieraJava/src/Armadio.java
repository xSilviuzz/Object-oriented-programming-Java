import java.util.*;

public interface Armadio<F extends Farmaco> extends Iterable<F>{

    void add(F item);
    boolean remove(F item);
    List<F> ripiano(int index);


    default List<F> cerca(String keyword){
        if(keyword == null) throw new NullPointerException();
        if(!keyword.matches("[A-Za-z0-9]{1,10}")) throw new IllegalArgumentException();
        List<F> ret = new ArrayList<F>();
        for(F f: this){
            if(f.getNome().val().contains(keyword)){
                ret.add(f);
            }
        }
    }


}
