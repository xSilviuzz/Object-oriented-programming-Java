import java.util.Objects;

public abstract class AbstractCampione implements Campione{

    Codice c;
    Nominativo n;
    DataOra dat;
    TipoCampione tip;
    Urgenza u;

    public AbstractCampione(Codice c, Nominativo n, DataOra dat, TipoCampione tip, Urgenza u) {
        this.c = c;
        this.n = n;
        this.dat = dat;
        this.tip = tip;
        this.u = u;
    }

    @Override
    public Codice getCodice() {
        return null;
    }

    @Override
    public Nominativo getPaziente() {
        return null;
    }

    @Override
    public DataOra getAccettazione() {
        return null;
    }

    @Override
    public TipoCampione getTipoCampione() {
        return null;
    }

    @Override
    public Urgenza getUrgenza() {
        return null;
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof AbstractCampione that)) return false;
        return Objects.equals(this.c, that.c);
    }

    @Override
    public int hashCode(){
        return Objects.hash(c);
    }

    @Override
    public String toString() {
        return "AbstractCampione{" +
                "Codice=" + c +
                ", Nominativo=" + n +
                ", Data=" + dat +
                ", Tipo=" + tip +
                ", Urgenza=" + u +
                '}';
    }


}
