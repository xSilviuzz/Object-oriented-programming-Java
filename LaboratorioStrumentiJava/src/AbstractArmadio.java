import java.util.*;

public abstract class AbstractArmadio<D extends Dispositivo> implements Armadio<D>{

    private final int numCassetti;
    private final int capCassetti;
    private final String codice;
    private final Famiglia<D> famiglia;

    public AbstractArmadio(int numCassetti, int capCassetti, String codice, Famiglia<D> famiglia){

        if(numCassetti < 0 || capCassetti < 0 ) throw new NullPointerException();
        if(codice == null) throw new NullPointerException();
        if(codice.isBlank()) throw new NullPointerException();
        if(!codice.matches("[a-zA-Z0-9\\s]+")) throw new IllegalArgumentException();
        if(famiglia == null) throw new NullPointerException();
        this.numCassetti = numCassetti;
        this.capCassetti = capCassetti;
        this.codice = codice;
        this.famiglia = famiglia;
    }


    public int getNumCassetti(){
        return numCassetti;
    }
    public int getCapCassetti(){
        return capCassetti;
    }
    public String getCodice(){
        return codice;
    }
    public Famiglia<D> getFamiglia(){
        return famiglia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Armadio: ").append(codice).append("\nNumero cassetti: ").append(numCassetti).append("\nCapacità cassetti: ").append(capCassetti).append("Famiglia: ").append(famiglia);
        sb.append("Dispositivo\n");
        for(D dispositivo : this){
            sb.append("\n"+dispositivo).append(",");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof AbstractArmadio<?> that)) return false;
        return Objects.equals(this.codice,that.codice);

    }


    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }
}
