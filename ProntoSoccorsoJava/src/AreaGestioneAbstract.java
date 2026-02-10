import java.awt.geom.Area;
import java.util.Objects;

public abstract class AreaGestioneAbstract<A extends AccessoPS> implements AreaGestione<A>{

    private final int numeroStanze;
    private final int capienzaPerStanza;
    private final String codice;

    public AreaGestioneAbstract(int numeroStanze, int capienzaPerStanza, String codice){

        if(numeroStanze < 0) throw new IllegalArgumentException();
        if(capienzaPerStanza < 0) throw new IllegalArgumentException();
        if(!codice.matches("^[A-Za-z]{3}[0-9]{3}$")) throw new IllegalArgumentException();
        this.codice = codice;
        this.numeroStanze = numeroStanze;
        this.capienzaPerStanza = capienzaPerStanza;

    }

    public String getCodice() {
        return codice;
    }
    public int getNumeroStanze(){
        return numeroStanze;
    }
    public int getCapienzaPerStanza(){
        return capienzaPerStanza;
    }


    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o != null || o.getClass() != this.getClass()){
            return false;
        }
        AreaGestioneAbstract that = (AreaGestioneAbstract) o;
        return(Objects.equals(codice, that.codice));
    }


    @Override
    public String toString() {
        return "AreaGestioneAbstract{" +
                "numeroStanze=" + numeroStanze +
                ", capienzaPerStanza=" + capienzaPerStanza +
                ", codice='" + codice + '\'' +
                '}';
    }
}
