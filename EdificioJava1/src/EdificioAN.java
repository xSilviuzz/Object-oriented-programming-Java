import java.util.*;

public class EdificioAN<U extends UnitaImmobiliare> extends AbstractEdificio<U>{

    private Object[] edificio;
    private int size;
    private int capTot;
    public EdificioAN(String codEd, TipoEdificio tipoEdificio) {
        super(codEd, tipoEdificio);
        this.size = 0;
        this.capTot = 10;
        this.edificio = new Object[capTot];
    }

    public void ingrandisci(){
        capTot *= 2;
        Object[] mom = new Object[capTot];
        for(int i = 0; i < size; i++){
            mom[i] = edificio[i];
        }
        edificio = mom;
    }

    public int trovaPosizione(U item){

        for(int i = 0; i < size; i++){
            U curr = (U)edificio[i];
            if(curr.compareTo(item) > 0) return i;
        }
        return size;
    }

    @Override
    public void add(U item){
        if(item == null) throw new NullPointerException();
        if(!item.getTipoUnita().equals(this.getTipoEdificio())) throw new IllegalArgumentException();

        int pos = trovaPosizione(item);
        if(size+1 >= capTot) ingrandisci();

        for(int i = size; i > pos; i--){
            edificio[i] = edificio[i-1];
        }
        edificio[pos] = item;
        size++;
    }


    @Override
    public Iterator<U> iterator(){
        return new Iterator<U>(){

            int index = 0;
            int ultimoRet = -1;
            boolean removable = false;

            @Override
            public boolean hasNext(){
                return index < size;
            }

            @Override
            public U next(){
                if(!hasNext()) throw new IllegalArgumentException();
                removable = true;
                ultimoRet = index;
                index++;
                U ret = (U) edificio[ultimoRet];
                return ret;
            }

            @Override
            public void remove(){
                if(!removable) throw new IllegalArgumentException();
                for(int i = ultimoRet; i < size-1; i++){
                    edificio[i] = edificio[i+1];
                }
                edificio[size] = null;
                size--;
                removable = false;
                index = ultimoRet;
            }
        };
    }


}
