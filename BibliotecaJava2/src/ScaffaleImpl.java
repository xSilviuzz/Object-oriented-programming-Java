import java.util.*;

public class ScaffaleImpl<D extends Documento> extends AbstractScaffale<D>{

    private final TipoDocumento<?> tipo;
    private List<D> scaffale = new ArrayList<D>();

    public ScaffaleImpl(int capacitaMassima, String identificativo, TipoDocumento<?> tipo) {
        super(capacitaMassima, identificativo);
        this.tipo = tipo;
    }

    public TipoDocumento<?> getTipo() {
        return tipo;
    }

    @Override
    public void aggiungi(D doc){
        if(!doc.getTipo().equals(tipo)) throw new IllegalArgumentException();
        if(scaffale.size() >= this.capacitaMassima()) throw new IllegalArgumentException();
        scaffale.add(doc);
        Collections.sort(scaffale);
    }

    @Override
    public Iterator<D> iterator(){
        return scaffale.iterator();
    }

}
