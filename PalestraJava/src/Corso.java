public interface Corso extends Comparable{
    CodiceCorso codice(int cod);
    String nome();
    int capacitaMassima();
    int numeroIstruttori();
    Orario orario(String gio, int ora, Minuti min);
    int durataMinuti();
    Intensita intensita();

}
