import java.util.*;

public abstract class AbstractCapo implements Capo{

    private final CodiceCapo codice;
    private final Descrizione descrizione;
    private final Taglia taglia;
    private final Stagione stagione;
    private final Prezzo prezzo;

    public AbstractCapo(CodiceCapo codice, Descrizione descrizione, Taglia taglia, Stagione stagione, Prezzo prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.taglia = taglia;
        this.stagione = stagione;
        this.prezzo = prezzo;
    }

    @Override
    public CodiceCapo codice() {
        return codice;
    }

    @Override
    public Descrizione descrizione() {
        return descrizione;
    }

    @Override
    public Taglia taglia() {
        return taglia;
    }

    @Override
    public Stagione stagione() {
        return stagione;
    }

    @Override
    public Prezzo prezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Capo{" +
                "codice=" + codice +
                ", descrizione=" + descrizione +
                ", taglia=" + taglia +
                ", stagione=" + stagione +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof AbstractCapo that)) return false;
        return Objects.equals(this.codice,that.codice);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codice);
    }
}
