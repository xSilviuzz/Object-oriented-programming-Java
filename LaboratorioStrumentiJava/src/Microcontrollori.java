public class Microcontrollori extends AbstractDispositivo{

    private final Famiglia<Microcontrollori> famiglia;

    public Microcontrollori(Codice codice, Anno annoProduzione, Anno annoAcquisto, Nominativo nominativo, Famiglia<Microcontrollori> famiglia){
        super(codice, annoProduzione, annoAcquisto, nominativo);
        if(famiglia == null) throw new NullPointerException();
        this.famiglia = famiglia;

    }

    @Override
    public Famiglia<Microcontrollori> getFamiglia(){
        return famiglia;
    }

    @Override
    public String toString(){
        return super.toString()+"\nFamiglia: "+famiglia;
    }


}
