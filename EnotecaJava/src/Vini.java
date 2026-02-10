public class Vini extends AbstractBottiglia{

    private final Categoria<Vini> cat;

    public Vini(Etichetta etichetta, Anno annoVend, Anno annoImb, Produttore produttore, Categoria<Vini> cat){
        super(etichetta, annoVend, annoImb, produttore);
        if(cat == null) throw new NullPointerException();
        this.cat = cat;
    }

    @Override
    public Categoria getCategoria(){
        return cat;
    }

    @Override
    public String toString(){
        return super.toString()+"\nCategoria Vino: "+cat;
    }
}
