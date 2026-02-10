import java.util.*;

public class ArmadioImpl<D extends Dispositivo> extends AbstractArmadio<D>{

    private final List<D> dispositivi  = new ArrayList<>();

    public ArmadioImpl(int numCassetti, int capCassetti, String codice, Famiglia<D> famiglia){
        super(numCassetti, capCassetti, codice, famiglia);
    }

    @Override
    public void add(D item){
        if(item == null) throw new NullPointerException();
        if(!item.getFamiglia().equals(this.getFamiglia())) throw new IllegalArgumentException();
        if(dispositivi.size() >= getCapCassetti() * getCapCassetti()) throw new NoSuchElementException();
        dispositivi.add(item);
        Collections.sort(dispositivi);
    }

    @Override
    public List<D> cassetto(int index){
        List<D> ret = new ArrayList<>();
        if(index < 0 || index > getNumCassetti()) throw new IllegalArgumentException();

        int indiceIniziale =  getCapCassetti() * index;
        int indiceFinale = (indiceIniziale) + getNumCassetti();

        for(int i = indiceIniziale; i < indiceFinale; i++){
            ret.add(dispositivi.get(i));
        }
        return ret;
    }

    @Override
    public Iterator<D> iterator(){
        return dispositivi.iterator();
    }


}
