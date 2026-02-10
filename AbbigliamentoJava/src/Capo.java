public interface Capo extends Comparable<Capo>{

    CodiceCapo codice();
    Descrizione descrizione();
    Taglia taglia();
    Stagione stagione();
    Prezzo prezzo();
    TipoCapo<?> tipo();

    default int compareTo(Capo o){
        return this.codice().val().compareTo(o.codice().val());
    }
}
