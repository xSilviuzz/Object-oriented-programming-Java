import java.util.*;

public interface Armadio<D extends Dispositivo> extends Iterable<D>{

    void add(D item);

    default boolean remove(D item){
        if(item == null) throw new NullPointerException();
        Iterator<D> jamu = iterator();
        while(jamu.hasNext()){
            D curr = jamu.next();
            if(curr.equals(item)){
                jamu.remove();
                return true;
            }
        }
        return false;
    }

    List<D> cassetto(int index);

    default List<D> inGaranzia(Anno riferimento){
        List<D> ret = new ArrayList<>();

        for(D dispositivo : this){
            if(( riferimento.val() - dispositivo.annoAcquisto().val() )<= 2){
                ret.add(dispositivo);
            }
        }
        return ret;
    }


}
