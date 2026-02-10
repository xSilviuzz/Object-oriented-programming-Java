import java.util.*;


public interface Cantinetta<B extends Bottiglia> extends Iterable<B>{

    void add(B item);
    boolean remove(B item);
    List<B> ripiano(int index);

    default List<B> cerca(String keyword){
        if(keyword == null) throw new NullPointerException();
        if(!keyword.matches("[A-Za-z0-9]{1,10}")) throw new IllegalArgumentException();
        List<B> ret = new ArrayList<B>();

        for(B b : this){
            if(b.getNomeCommerciale().val().contains(keyword)){
                ret.add(b);
            }
        }
        return ret;
    }


}
