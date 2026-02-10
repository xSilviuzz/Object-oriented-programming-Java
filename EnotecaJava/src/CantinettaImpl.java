
import java.util.*;

public class CantinettaImpl<B extends Bottiglia> extends AbstractCantinetta<B> {

    private final List<List <B>> cantinetta;

    public CantinettaImpl(Categoria<B> categoria, int numRipiani, int capRipiani, String cod, List<List<B>> cantinetta){
        super(categoria, numRipiani, capRipiani, cod);


        cantinetta = new ArrayList<List<B>>(numRipiani);
        this.cantinetta = cantinetta;

        for(int i = 0; i < numRipiani; i++){
            cantinetta.add(new ArrayList<B>());
        }
    }

    @Override
    public void add(B item){
        if(item == null) throw new NullPointerException();
        if(!item.getCategoria().equals(this.getCategoria())) throw new IllegalArgumentException();
        for(List<B> ripiano: cantinetta){
            if(ripiano.size()< this.getNumRipiani()){
                ripiano.add(item);
                Collections.sort(ripiano);
                return;
            }
        }
    }

    @Override
    public boolean remove(B item){
        if(item == null) throw new NullPointerException();
        for(List<B> ripiano : cantinetta){
            if(ripiano.remove(item)) {
                return true;
            }
        }

        return false;

    }
    @Override
    public List<B> ripiano(int index){
        if(index < 0 || index > this.getNumRipiani()) throw new IllegalArgumentException();
        List<B> ret = new ArrayList<B>(cantinetta.get(index));

        return ret;
    }

    @Override
    public Iterator<B> iterator(){
        List<B> tot = new ArrayList<B>();
        for(List<B> ripiano : cantinetta){
            tot.addAll(ripiano);
        }
        return tot.iterator();
    }

}
