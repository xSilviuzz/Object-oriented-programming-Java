import java.util.*;

public class ArmadioImpl<F extends Farmaco> extends AbstractArmadio<F>{

    private final List<List<F>> armadio;

    public ArmadioImpl(int numRipiani, int capRipiani, String codice, ClasseTerapeutica<F> cla, List<List<F>> armadio){
        super(numRipiani, capRipiani, codice, cla);

        this.armadio = armadio;
        armadio = new ArrayList<List<F>>(numRipiani);

        for(int i = 0; i < numRipiani; i++){
            armadio.add(new ArrayList<F>());
        }
    }

    @Override
    public void add(F item){
        if(item == null) throw new IllegalArgumentException();
        if(!item.getClasse().equals(this.getCla())) throw new IllegalArgumentException();

        for(List<F> ripiano : armadio){
            if(ripiano.size() >= this.getNumRipiani()) throw new IllegalArgumentException();
            ripiano.add(item);
            Collections.sort(ripiano);
        }

    }

    @Override
    public boolean remove(F item){
        if(item == null) throw new IllegalArgumentException();

        for(List<F> ripiano: armadio){
            for(F farmaco : ripiano){
                if(item.equals(farmaco)){
                    ripiano.remove(item);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<F> ripiano(int index){
        if(index < 0 || index > this.getNumRipiani()) throw new IllegalArgumentException();

        List<F> ret = new ArrayList<F>(armadio.get(index));

        return ret;

    }

    @Override
    public Iterator<F> iterator(){

        List<F> tot = new ArrayList<>();

        for(List<F> ripiano : armadio){
            tot.addAll(ripiano);
        }

        return tot.iterator();
    }
}
