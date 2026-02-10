import java.util.*;

public abstract class AbstractCantinetta<B extends Bottiglia> implements Cantinetta<B>{

    private final Categoria<B> categoria;
    private final int numRipiani;
    private final int capRipiani;
    private final String cod;

    protected AbstractCantinetta(Categoria<B> categoria, int numRipiani, int capRipiani, String cod){

        if(categoria == null) throw new NullPointerException();
        if(numRipiani <= 0 || capRipiani <= 0) throw new IllegalArgumentException();
        if(cod == null) throw new NullPointerException();
        if(!cod.matches("[A-Za-z0-9]{1,5}")) throw new IllegalArgumentException();

        this.categoria = categoria;
        this.numRipiani = numRipiani;
        this.capRipiani = capRipiani;
        this.cod = cod;
    }

    public Categoria<B> getCategoria(){
        return categoria;
    }
    public int getNumRipiani(){
        return numRipiani;
    }
    public int getcapRipiani(){
        return capRipiani;
    }
    public String getCod(){
        return cod;
    }

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || !(o instanceof Cantinetta<?>)) return false;
        AbstractCantinetta<?> that = (AbstractCantinetta<?>) o;
        return Objects.equals(that.cod, cod);
    }


    @Override
    public int hashCode(){
        return Objects.hash(cod);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Cantinetta: #").append(cod).append(", numRipiani: ").append(numRipiani).append(", Capacità Ripiani: ").append(capRipiani).append("\n");
        sb.append("ELENCO BOTTIGLIE: \n");
                for(B bottiglia : this){
                    sb.append(bottiglia).append("\n");
                }
        sb.append("--------------");
        return sb.toString();
    }

}
