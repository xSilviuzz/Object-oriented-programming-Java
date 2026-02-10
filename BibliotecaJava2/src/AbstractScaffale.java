import java.util.*;

public abstract class AbstractScaffale<D extends Documento> implements Scaffale<D>{

    private final int capacitaMassima;
    private final String identificativo;

    public AbstractScaffale(int capacitaMassima, String identificativo) {
        if(capacitaMassima < 1 || capacitaMassima > 50) throw new IllegalArgumentException();
        if(identificativo == null) throw new NullPointerException();
        this.capacitaMassima = capacitaMassima;
        this.identificativo = identificativo;
    }

    @Override
    public int capacitaMassima() {
        return capacitaMassima;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractScaffale<?> that)) return false;
        return Objects.equals(this.identificativo, that.identificativo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(identificativo);
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("SCAFFALE: ").append(identificativo);
        for(D d : this){
            sb.append(d).append("\n");
        }
        return sb.toString();
    }
}
