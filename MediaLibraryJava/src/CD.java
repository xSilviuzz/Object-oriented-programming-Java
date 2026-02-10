public class CD implements Supporto{

    private Titolo titolo;
    private Anno annoEdizione;
    private Anno annoAcquisto;
    private Nominativo autore;
    private Genere<CD> genere;

    public CD(Titolo titolo, Anno annoEdizione, Anno annoAcquisto, Nominativo autore, Genere genere){

        this.titolo = titolo;
        this.annoEdizione = annoEdizione;
        this.annoAcquisto = annoAcquisto;
        this.autore = autore;
        this.genere = genere;

    }

    @Override
    public Titolo getTitolo() {
        return titolo;
    }

    @Override
    public Anno annoEdizione() {
        return annoEdizione;
    }

    @Override
    public Anno annoAcquisto() {
        return annoAcquisto;
    }

    @Override
    public Nominativo getAutore() {
        return autore;
    }

    @Override
    public Genere getGenere() {
        return genere;
    }

    public String toString(){

        return(
                        "\nTitolo: "+titolo+
                        "\nEdizione: "+annoEdizione+
                        "\nAcquisto: "+annoAcquisto+
                        "\nAutore: "+autore+
                        "\nGenere: "+genere
                );

    }
}
