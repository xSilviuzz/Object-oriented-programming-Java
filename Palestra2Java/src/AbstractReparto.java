import java.util.Objects;

public abstract class AbstractReparto implements Reparto{

    private final CodiceReparto codice;
    private final NomeReparto nome;
    private final CapacitaPazienti capacita;
    private final int medici;
    private final Superficie superficie;
    private final Criticita criticita;

    public AbstractReparto(CodiceReparto codice, NomeReparto nome, CapacitaPazienti capacita, int medici, Superficie superficie, Criticita criticita) {
        if(medici < 1 || medici > 50) throw new IllegalArgumentException();
        this.codice = codice;
        this.nome = nome;
        this.capacita = capacita;
        this.medici = medici;
        this.superficie = superficie;
        this.criticita = criticita;
    }

    @Override
    public CodiceReparto codice() {
        return codice;
    }

    @Override
    public NomeReparto nome() {
        return nome;
    }

    @Override
    public CapacitaPazienti capacita() {
        return capacita;
    }

    @Override
    public int medici() {
        return medici;
    }

    @Override
    public Superficie superficie() {
        return superficie;
    }

    @Override
    public Criticita criticita() {
        return criticita;
    }

    @Override
    public String toString() {
        return "Reparto{" +
                "codice=" + codice +
                ", nome=" + nome +
                ", capacita=" + capacita +
                ", medici=" + medici +
                ", superficie=" + superficie +
                ", criticita=" + criticita +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof AbstractReparto that)) return false;
        return Objects.equals(this.codice, that.codice);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }

}
