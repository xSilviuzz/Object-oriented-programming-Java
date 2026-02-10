public class TerapiaIntensiva extends AbstractReparto{

    private final Monitoraggio monitoraggio;
    public TerapiaIntensiva(CodiceReparto codice, NomeReparto nome, CapacitaPazienti capacita, int medici, Superficie superficie, Criticita criticita, Monitoraggio monitoraggio) {
        super(codice, nome, capacita, medici, superficie, criticita);
        if(medici < 15 || medici > 50) throw new IllegalArgumentException();
        this.monitoraggio = monitoraggio;
    }

    public Monitoraggio getMonitoraggio() {
        return monitoraggio;
    }

    @Override
    public String toString(){
        return (super.toString()+"\nMonitoraggio: "+monitoraggio);
    }

}
