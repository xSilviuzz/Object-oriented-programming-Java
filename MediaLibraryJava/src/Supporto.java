public interface Supporto extends Comparable<Supporto>{
    Titolo getTitolo();
    Anno annoEdizione();
    Anno annoAcquisto();
    Nominativo getAutore();
    Genere getGenere();

    default public int compareTo(Supporto o) {
        return this.getAutore().nominativo().compareTo(o.getAutore().nominativo());
    }
}
