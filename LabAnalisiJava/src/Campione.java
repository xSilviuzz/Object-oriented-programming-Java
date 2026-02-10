public interface Campione extends Comparable<Campione>{

    Codice getCodice();
    Nominativo getPaziente();
    DataOra getAccettazione();
    TipoCampione getTipoCampione();
    Urgenza getUrgenza();
    Esame<TipoCampione> getEsame();

    default int compareTo(Campione o){
        if(o == null) return 1;
        if(this == o) return 0;
        int c = this.getPaziente().val().compareToIgnoreCase(o.getPaziente().val());
        if(c != 0) return c;
        if(this.getAccettazione().val() < o.getAccettazione().val()){
            return -1;
        }
        return 1;
    }


}
