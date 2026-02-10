public interface Libro extends Comparable<Libro> {
    String titolo();
    String autore();
    int pagine();
    int annoPubblicazione();
}
