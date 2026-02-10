public class Tesi extends AbstractDocumento{

    private final TipoDocumento<Tesi> tipo;

    public Tesi(Codice codice, Anno annoPubblicazione, Titolo titolo, Autore autore, TipoDocumento<Tesi> tipo) {
        super(codice, annoPubblicazione, titolo, autore);
        this.tipo = tipo;
    }

    @Override
    public TipoDocumento<Tesi> getTipo() {
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo libro: "+tipo;
    }
}
