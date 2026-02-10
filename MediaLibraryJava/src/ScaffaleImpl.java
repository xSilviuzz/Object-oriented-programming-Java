import java.util.*;

public class ScaffaleImpl<S extends Supporto> implements Scaffale<S>{

    private List<S> scaf = new ArrayList<>();

    private int ident;
    private int numMens;
    private int numScaffali;
    private Genere<S> genere;

    public ScaffaleImpl(int ident, int numMens, int numScaffali, Genere<S> genere){
        if(ident < 0 || numMens < 0 || numScaffali < 0) throw new NoSuchElementException();

        this.ident = ident;
        this.numMens = numMens;
        this.numScaffali = numScaffali;
        this.genere = genere;
    }


    @Override
    public void add(S item) {
        if(this.scaf.size()+1 > numScaffali) throw new NoSuchElementException();
        if(!item.getGenere().equals(genere)) throw new NoSuchElementException();

        scaf.add(item);
        Collections.sort(scaf);
    }


    @Override
    public List<S> mensola(int index){
        List<S> ret = new ArrayList<>();

        for(int i = 0; i<this.numMens; i++){
            if(i == index){

            }
        }
        return ret;
    }

    @Override
    public Iterator<S> iterator() {
        return scaf.iterator();
    }



}
