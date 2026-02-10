import java.util.*;

public abstract class AbstractArmadio<C extends Capo> implements Armadio<C>{

    private final int numModuli;
    private final int numScompartiPerModulo;
    private final int capScomparto;

    public AbstractArmadio(int numModuli, int numScompartiPerModulo, int capScomparto) {
        if(numModuli < 0 || numScompartiPerModulo < 0 || capScomparto < 0) throw new IllegalArgumentException();
        this.numModuli = numModuli;
        this.numScompartiPerModulo = numScompartiPerModulo;
        this.capScomparto = capScomparto;
    }

    public int getNumModuli() {
        return numModuli;
    }

    public int getNumScompartiPerModulo() {
        return numScompartiPerModulo;
    }

    public int getCapScomparto() {
        return capScomparto;
    }


    @Override
    public List<C> scomparto(int modulo, int scomparto){
        List<C> ret = new ArrayList<C>();
        int start = (modulo * capScomparto * numScompartiPerModulo) + (scomparto * capScomparto);
        int stop = start + capScomparto;
        int count = 0;
        for(C c: this){
            if(count >= start && count < stop){
                ret.add(c);
            }
            count++;
        }
        return ret;
    }

    @Override
    public List<C> modulo(int modulo){
        List<C> ret = new ArrayList<C>();
        int start = modulo * capScomparto * numScompartiPerModulo;
        int stop = start + capScomparto * numScompartiPerModulo;
        int count = 0;
        for(C c: this){
            if(count >= start && count < stop){
                ret.add(c);
            }
            count++;
        }
        return ret;
    }


    @Override
    public boolean verificaStandard(){
        if(valoreTotale() < 300) return false;

        int est = 0;
        int inv = 0;
        int prim = 0;
        int aut = 0;
        for(C c : this){
            if(c.stagione().equals(Stagione.ESTATE)) est++;
            if(c.stagione().equals(Stagione.INVERNO)) inv++;
            if(c.stagione().equals(Stagione.PRIMAVERA)) prim++;
            if(c.stagione().equals(Stagione.AUTUNNO)) aut++;
        }
        if(est == 0 || inv == 0 || prim == 0 || aut == 0){
            return false;
        }

        //NESSUNA IDEA SU COME IMPLEMENTARE L'ALTRA CONDIZIONE


        return true;
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CONFIG;").append(capScomparto+";").append(numModuli+";").append(numScompartiPerModulo);
        for(C c: this){
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractArmadio<?> that)) return false;
        return Objects.equals(this.getNumModuli(), that.getNumModuli()) && Objects.equals(this.getCapScomparto(), that.getCapScomparto()) && Objects.equals(this.getNumScompartiPerModulo(), that.getNumScompartiPerModulo());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getNumModuli(), getCapScomparto(), getNumScompartiPerModulo());
    }
}
