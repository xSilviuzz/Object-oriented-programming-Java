import java.util.*;

public interface Edificio<U extends UnitaImmobiliare> extends Iterable<U>{

    void add(U item);

    default boolean remove(U item){
        if(item == null) throw new NullPointerException();
        Iterator<U> it = iterator();
        while(it.hasNext()){
            U curr = it.next();
            if(curr.equals(item)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    default U getUnitaImmobiliare(int index){
        if(index < 0) throw new NullPointerException();
        int count = 0;
        for(U u:this){
            if(index == count) return u;
            count++;
        }
        throw new IllegalArgumentException("Indice non valido");
    }

    default List<U> cerca(String keyword){
        if(keyword == null) throw new NullPointerException();
        if(!keyword.matches("[a-zA-z0-9]{1,10}")) throw new IllegalArgumentException();
        List<U> ret = new ArrayList<>();
        for(U u :this){
            if(u.getId().val().contains(keyword) || u.getProprietario().val().contains(keyword)){
                ret.add(u);
            }
        }
        return ret;
    }


}
