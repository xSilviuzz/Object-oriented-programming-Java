import java.util.*;

public class ScaffaleImpl<S extends Supporto> extends AbstractScaffale<S>{

    private final List<S> ret = new ArrayList<S>();
    private final Genere<S> genere;

    public ScaffaleImpl(int numMens, int capMens, int cod, Genere<S> genere){
        super(numMens, capMens, cod);
        this.genere = genere;
    }


    public List<S> getRet() {
        return ret;
    }

    public Genere<S> getGenere() {
        return genere;
    }

    @Override
    public void add(S item){
        if(item == null) throw new NullPointerException();
        ret.add(item);
        Collections.sort(ret);
    }

    @Override
    public Iterator<S> iterator(){
        return ret.iterator();
    }
}
