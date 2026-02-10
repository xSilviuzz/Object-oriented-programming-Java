public class Appartamento extends AbstractUnitaImmobiliare{

    private final Categoria<Appartamento> cat;
    private final TipoEdificio tipoEd;
    public Appartamento(Identificativo id, Anno aC, Anno aQ, Nominativo nom, Categoria<Appartamento> cat){
        super(id,aC,aQ,nom);
        if(cat == null) throw new NullPointerException();
        if(!id.val().matches("^A-[0-9]{2}-[A-Z]")) throw new IllegalArgumentException();
        this.cat = cat;
        this.tipoEd = TipoEdificio.APPARTAMENTO;
    }

    @Override
    public Categoria<Appartamento> getCategoria(){
        return cat;
    }
    @Override
    public TipoEdificio getTipoUnita() {
        return tipoEd;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAppartamento: "+cat;
    }

}
