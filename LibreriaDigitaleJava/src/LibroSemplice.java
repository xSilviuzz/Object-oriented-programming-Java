public class LibroSemplice implements Libro{

    String titolo;
    String autore;
    int pagine;
    int annoPubblicazione;

    public LibroSemplice(String titolo, String autore, int pagine, int annoPubblicazione){
        if(titolo.length() > 50 || titolo == null) throw new IllegalArgumentException("Titolo non valido");
        if(autore == null) throw new IllegalArgumentException("Autore non valido");
        if(pagine < 0) throw new IllegalArgumentException("Pagine non valide");
        if(annoPubblicazione < 1900 || annoPubblicazione > 2025) throw new IllegalArgumentException("Anno non valido");

        this.titolo = titolo;
        this.autore = autore;
        this.pagine = pagine;
        this.annoPubblicazione = annoPubblicazione;
    }


    public String titolo() {
        return titolo;
    }

    public String autore() {
        return autore;
    }

    public int pagine() {
        return pagine;
    }

    public int annoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public String toString() {
        return "LibroSemplice{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", pagine=" + pagine +
                ", annoPubblicazione=" + annoPubblicazione +
                "}\n";
    }

    public int compareTo(Libro other){
        if(this.annoPubblicazione < other.annoPubblicazione())return -1;
        if(this.annoPubblicazione > other.annoPubblicazione())return 1;
        return 0;
    }

}
