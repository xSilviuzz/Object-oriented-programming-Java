import java.util.Objects;

public abstract class AbstractSupporto implements Supporto{

    private final Titolo t;
    private final Anno aE;
    private final Anno aA;
    private final Nominativo aut;

    public AbstractSupporto(Titolo t, Anno aE, Anno aA, Nominativo aut) {
        this.t = t;
        this.aE = aE;
        this.aA = aA;
        this.aut = aut;
    }

    @Override
    public Titolo getTitolo() {
        return null;
    }

    @Override
    public Anno annoEdizione() {
        return null;
    }

    @Override
    public Anno annoAcquisto() {
        return null;
    }

    @Override
    public Nominativo getAutore() {
        return null;
    }

    @Override
    public String toString() {
        return "AbstractSupporto{" +
                "TITOLO=" + t +
                ", aE=" + aE +
                ", aA=" + aA +
                ", aut=" + aut +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractSupporto that)) return false;
        return Objects.equals(this.t, that.t) && Objects.equals(this.aE, that.aE);
    }

    @Override
    public int hashCode(){
        return Objects.hash(t,aE);
    }


}
