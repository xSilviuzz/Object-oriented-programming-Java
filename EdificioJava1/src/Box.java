public class Box extends AbstractUnitaImmobiliare{

    private final Categoria<Box> cat;
    private final TipoEdificio tipoEd;
    public Box(Identificativo id, Anno aC, Anno aQ, Nominativo nom, Categoria<Box> cat){
        super(id,aC,aQ,nom);
        if(cat == null) throw new NullPointerException();
        if(!id.val().matches("^B-[0-9]{2}-[A-Z]")) throw new IllegalArgumentException();
        this.cat = cat;
        this.tipoEd = TipoEdificio.BOX;
    }

    @Override
    public Categoria<Box> getCategoria(){
        return cat;
    }
    @Override
    public TipoEdificio getTipoUnita() {
        return tipoEd;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBox: "+cat;
    }
}
