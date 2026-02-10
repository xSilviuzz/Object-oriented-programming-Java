import java.util.*;

public class OspedaleImpl implements Ospedale{

    private String nome;
    private List<Reparto> ret = new ArrayList<>();
    public OspedaleImpl(String nome) {
        this.nome = nome;
    }

    public int getNumReparti(){
        return ret.size();
    }

    public List<Reparto> getListOspedale() {
        return ret;
    }

    @Override
    public void aggiungiReparto(Reparto r){
        ret.add(r);
        Collections.sort(ret);
    }

    @Override
    public Iterator<Reparto> iterator(){
        return ret.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ospedale: ").append(nome);
        for(Reparto r : ret){
            sb.append(r).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof OspedaleImpl that)) return false;
        return Objects.equals(this.nome, that.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }

}
