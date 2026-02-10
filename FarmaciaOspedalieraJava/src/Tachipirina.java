public class Tachipirina extends AbstractFarmaco{

    private final ClasseTerapeutica<Tachipirina> cla;

    public Tachipirina(NomeCommerciale nome, Data scadenza, Data produzione, PrincipioAttivo principio, ClasseTerapeutica<Tachipirina> cla){
        super(nome, scadenza, produzione, principio);
        this.cla = cla;
    }



    @Override
    public ClasseTerapeutica<Tachipirina> getClasse(){
        return cla;
    }

    @Override
    public String toString(){
        return super.toString()+"\nClasse Terapeutica: "+cla;
    }

}
