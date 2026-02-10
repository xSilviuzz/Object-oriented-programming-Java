import java.util.*;

public abstract class AbstractArmadio<F extends Farmaco> implements Armadio<F> {

    private final int numRipiani;
    private final int capRipiani;
    private final String codice;
    private final ClasseTerapeutica<F> cla;

    public AbstractArmadio(int numRipiani, int capRipiani, String codice, ClasseTerapeutica<F> cla){
        if(numRipiani < 0 || capRipiani < 0) throw new IllegalArgumentException();
        if(codice == null) throw new NullPointerException();
        if(!codice.matches("[0-9]{3}")) throw new IllegalArgumentException();
        if(cla == null) throw new NullPointerException();

        this.numRipiani = numRipiani;
        this.capRipiani = capRipiani;
        this.codice = codice;
        this.cla = cla;
    }

    public int getNumRipiani() {
        return numRipiani;
    }

    public int getCapRipiani() {
        return capRipiani;
    }

    public String getCodice() {
        return codice;
    }

    public ClasseTerapeutica<F> getCla() {
        return cla;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        AbstractArmadio<?> that = (AbstractArmadio<?>) o;
        return Objects.equals(this.codice, that.codice);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nARMADIO: ").append(codice).append(("Numero ripiani: ")).append(numRipiani).append("\nCapacità ripiani: ").append(capRipiani).append("C\nategoria: ").append(cla);
        sb.append("\nElenco Farmaci: ");
        for(F f: this){
            sb.append(f).append("\n");
        }
        return sb.toString();
    }





}
