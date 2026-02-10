public class Sensore extends AbstractDispositivo{

    private final Famiglia<Sensore> famiglia;

    public Sensore(Codice codice, Anno annoProduzione, Anno annoAcquisto, Nominativo nominativo, Famiglia<Sensore> famiglia){
        super(codice, annoProduzione, annoAcquisto, nominativo);
        if(famiglia == null) throw new NullPointerException();
        this.famiglia = famiglia;

    }

    @Override
    public Famiglia<Sensore> getFamiglia(){
        return famiglia;
    }

    @Override
    public String toString(){
        return super.toString()+"\nFamiglia: "+famiglia;
    }

}
