import java.util.*;

public class EdificioImpl<U extends UnitaImmobiliare> extends AbstractEdificio<U>{

    private final List<U> edificio;

    public EdificioImpl(String codEd, TipoEdificio tipoEdificio) {
        super(codEd, tipoEdificio);
        this.edificio = new ArrayList<>();
    }

    public List<U> getEdificio() {
        return edificio;
    }

    @Override
    public void add(U item){
        if(item == null) throw new IllegalArgumentException();
        if(!item.getTipoUnita().equals(this.getTipoEdificio())) throw new IllegalArgumentException();
        edificio.add(item);
        Collections.sort(edificio);
    }

    @Override
    public Iterator<U> iterator(){
        return edificio.iterator();
    }

}
