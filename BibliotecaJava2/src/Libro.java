public class Libro extends AbstractDocumento{

    private final TipoDocumento<Libro> tipo;

    public Libro(Codice codice, Anno annoPubblicazione, Titolo titolo, Autore autore, TipoDocumento<Libro> tipo) {
        super(codice, annoPubblicazione, titolo, autore);
        this.tipo = tipo;
    }

    @Override
    public TipoDocumento<Libro> getTipo() {
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTipo libro: "+tipo;
    }
}
