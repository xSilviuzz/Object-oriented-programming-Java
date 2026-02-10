public interface Dispositivo extends Comparable<Dispositivo>{

    Codice getCodice();
    Anno annoProduzione();
    Anno annoAcquisto();
    Nominativo getProduttore();
    Famiglia<? extends Dispositivo> getFamiglia();

    @Override
    default int compareTo(Dispositivo o){
        return this.getProduttore().val().compareTo(o.getProduttore().val());
    }


}
