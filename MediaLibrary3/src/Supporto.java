public interface Supporto extends Comparable<Supporto>{
    Titolo getTitolo();
    Anno annoEdizione();
    Anno annoAcquisto();
    Nominativo getAutore();
    Genere<?> getGenere();

    default int compareTo(Supporto o){
        if(o == null) return 1;
        if(this == o) return 0;
        return this.getAutore().val().compareToIgnoreCase(o.getAutore().val());
    }
}
