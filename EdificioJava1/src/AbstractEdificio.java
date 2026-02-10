import java.util.*;

public abstract class AbstractEdificio<U extends UnitaImmobiliare> implements Edificio<U>{

    private final String codEd;
    private final TipoEdificio tipoEdificio;

    public AbstractEdificio(String codEd, TipoEdificio tipoEdificio) {
        if(codEd == null) throw new NullPointerException();
        if(!codEd.matches("^E[0-9]{2}")) throw new IllegalArgumentException();
        this.codEd = codEd;
        this.tipoEdificio = tipoEdificio;
    }

    public String getCodEd() {
        return codEd;
    }

    public TipoEdificio getTipoEdificio() {
        return tipoEdificio;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("EDIFICIO: ").append(codEd).append("\n");
        for(U u: this){
            sb.append("U;").append(u.getId().val()).append(";").append(u.getProprietario().val()).append(";").append(u.getTipoUnita()).append(";").append(u.annoCostruzione().val()).append(";").append(u.annoAcquisto().val()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof AbstractEdificio<?> that)) return false;
        return Objects.equals(this.codEd, that.codEd);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codEd);
    }
}
