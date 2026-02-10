public interface AccessoPS extends Comparable<AccessoPS>{

    Codice getCodice();
    DataOra getArrivo();
    DataOra getDimissione();
    Nominativo getPaziente();
    Categoria getCategoria();
    Priorita getPriorita();

    default int compareTo(AccessoPS o){
        if(o == null) return 1;
        int c = this.getPaziente().val().compareToIgnoreCase(o.getPaziente().val());
        if(c != 0) return c;
        return (this.getArrivo().val().compareTo(o.getArrivo().val()));
    }





}
