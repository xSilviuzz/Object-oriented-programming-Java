import java.util.*;

public class ArmadioAN<C extends Capo> extends AbstractArmadio<C>{


    private final Object[] armadio;
    private int size;
    private final int cap;

    public ArmadioAN(int numModuli, int numScompartiPerModulo, int capScomparto) {
        super(numModuli, numScompartiPerModulo, capScomparto);
        this.cap = numModuli*numScompartiPerModulo*capScomparto;
        this.armadio = new Object[cap];
        this.size = 0;
    }

    @Override
    public void aggiungi(C capo){
        //PONIAMO IL CASO I CONTROLLI SIANO STATI GIA FATTI
        if(size>= cap) throw new IndexOutOfBoundsException();
        int pos = trovaPosizione(capo);
        for(int i = size; i > pos; i--){
            armadio[i] = armadio[i-1];
        }
        armadio[pos] = capo;
        size++;

    }


    public int trovaPosizione(C capo){
        for(int i = 0; i < size; i++){
            C curr = (C) armadio[i];
            if(curr.compareTo(capo) > 0){
                return i;
            }
        }
        return size;
    }


    @Override
    public Iterator<C> iterator(){
        return new Iterator<C>(){

            int index = 0;
            int ultimoRet = -1;
            boolean removable = false;
            @Override
            public boolean hasNext(){
                return index < size;
            }
            @Override
            public C next(){
                if(!hasNext()) throw new NoSuchElementException();
                ultimoRet = index;
                C ret = (C) armadio[index];
                index++;
                removable = true;
                return ret;
            }
            @Override
            public void remove(){
                if(!removable) throw new IllegalArgumentException();
                for(int i = ultimoRet; i < size-1; i++){
                    armadio[i] = armadio[i+1];
                }
                armadio[size-1] = null;
                size--;
                removable = false;
                index = ultimoRet;

            }

        };
    }

}
