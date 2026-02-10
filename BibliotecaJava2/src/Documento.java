public interface Documento extends Comparable<Documento>{
    Codice getCodice();
    Anno getAnnoPubblicazione();
    Titolo getTitolo();
    Autore getAutore();
    TipoDocumento<?> getTipo();

    default int compareTo(Documento altro){
        int cmpAnno = altro.getAnnoPubblicazione().val() - this.getAnnoPubblicazione().val();
        if(cmpAnno != 0) return cmpAnno;
        return this.getTitolo().val().compareTo(altro.getTitolo().val());
    }
}
