import java.util.*;

public abstract class AbstractUnitaImmobiliare implements UnitaImmobiliare{

    private final Identificativo id;
    private final Anno aC;
    private final Anno aQ;
    private final Nominativo nom;

    public AbstractUnitaImmobiliare(Identificativo id, Anno aC, Anno aQ, Nominativo nom){
        this.id = id;
        this.aC = aC;
        this.aQ = aQ;
        this.nom = nom;
    }

    @Override
    public Identificativo getId() {
        return id;
    }

    @Override
    public Anno annoCostruzione() {
        return aC;
    }

    @Override
    public Anno annoAcquisto() {
        return aQ;
    }

    @Override
    public Nominativo getProprietario() {
        return nom;
    }

    @Override
    public String toString() {
        return "Unita Immobiliare{" +
                "Id=" + id +
                ", aC=" + aC +
                ", aQ=" + aQ +
                ", nom=" + nom +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractUnitaImmobiliare that)) return false;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode(){
       return Objects.hash(id);
    }

}
