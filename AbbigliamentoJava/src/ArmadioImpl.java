import java.util.*;

public class ArmadioImpl<C extends Capo> extends AbstractArmadio<C>{

    private final List<C> armadio;
    public ArmadioImpl(int numModuli, int numScompartiPerModulo, int capScomparto) {
        super(numModuli, numScompartiPerModulo, capScomparto);
        this.armadio = new ArrayList<C>();
    }

    public List<C> getArmadio() {
        return armadio;
    }

    @Override
    public void aggiungi(C capo){
        if(capo == null) throw new NullPointerException();
        if(armadio.size() >= getNumModuli() * getCapScomparto() * getNumScompartiPerModulo()) throw new IllegalArgumentException();
        armadio.add(capo);
        Collections.sort(armadio);
    }

    @Override
    public Iterator<C> iterator(){
        return armadio.iterator();
    }

}
