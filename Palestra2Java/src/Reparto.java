public interface Reparto extends Comparable<Reparto>{
    CodiceReparto codice();
    NomeReparto nome();
    CapacitaPazienti capacita();
    int medici();
    Superficie superficie();
    Criticita criticita();

    default int compareTo(Reparto o){
        if(o == null) throw new IllegalArgumentException();
        if(this == o) return 0;
        return this.codice().val().compareTo(o.codice().val());
    }
}
