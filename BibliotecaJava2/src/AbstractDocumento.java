import java.util.Objects;

public abstract class AbstractDocumento implements Documento{

    private final Codice codice;
    private final Anno annoPubblicazione;
    private final Titolo titolo;
    private final Autore autore;

    public AbstractDocumento(Codice codice, Anno annoPubblicazione, Titolo titolo, Autore autore) {
        this.codice = codice;
        this.annoPubblicazione = annoPubblicazione;
        this.titolo = titolo;
        this.autore = autore;
    }

    @Override
    public Codice getCodice() {
        return codice;
    }

    @Override
    public Anno getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public Titolo getTitolo() {
        return titolo;
    }

    @Override
    public Autore getAutore() {
        return autore;
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractDocumento that)) return false;
        return Objects.equals(this.codice,that.codice);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }

    @Override
    public String toString() {
        return "AbstractDocumento{" +
                "codice=" + codice +
                ", annoPubblicazione=" + annoPubblicazione +
                ", titolo=" + titolo +
                ", autore=" + autore +
                '}';
    }
}
