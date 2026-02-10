
import java.util.*;

public abstract class AbstractScaffale<S extends Supporto> implements Scaffale<S>{

    private final int numMens;
    private final int capMens;
    private final int cod;
    private final int size;

    public AbstractScaffale(int numMens, int capMens, int cod, int size) {
        this.numMens = numMens;
        this.capMens = capMens;
        this.cod = cod;
        this.size = size;
    }

    public int getNumMens() {
        return numMens;
    }

    public int getCapMens() {
        return capMens;
    }

    public int getCod() {
        return cod;
    }

    public int getSize() {
        return size;
    }

    @Override
    public List<S> mensola(int index){
        List<S> ret = new ArrayList<S>();
        if(capMens * numMens < index) throw new IllegalArgumentException();
        int count = 0;
        int start = index * capMens;
        int stop = start + capMens;
        for(S s : this){
            if(count >= start && count < stop){
                ret.add(s);
            }
            count++;
        }
        return ret;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Scaffale: #").append(cod).append("Numero mensole: ").append(numMens).append("Capacità mensole: ").append(capMens).append("\n");
        sb.append("Elenco supporti: \n");
        for(S s : this){
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractScaffale that)) return false;
        return Objects.equals(this.cod,that.cod);
    }

    @Override
    public int hashCode(){
        return Objects.hash(cod);
    }
}
