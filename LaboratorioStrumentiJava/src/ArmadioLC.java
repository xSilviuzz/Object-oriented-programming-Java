import java.util.*;
import java.util.NoSuchElementException;

public class ArmadioLC<D extends Dispositivo> extends AbstractArmadio<D>{

    public ArmadioLC(int numCassetti, int capCassetti, String codice, Famiglia<D> famiglia){
        super(numCassetti, capCassetti, codice, famiglia);
    }

    private final class Nodo{
        private Nodo next;
        private D info;

         Nodo(Nodo next, D info){
            this.next = next;
            this.info = info;
        }
    }

    private int size = 0;
    private Nodo head = null;
    private Nodo tail = null;

    @Override
    public void add(D item){
        if(item == null) throw new NullPointerException();
        if(!item.getFamiglia().equals(this.getFamiglia())) throw new IllegalArgumentException();
        if(size >= getCapCassetti() * getCapCassetti()) throw new NoSuchElementException();

        if(head == null || head.info.compareTo(item) > 0){
            head = new Nodo(head, item);
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.info.compareTo(item) < 0){
                curr = curr.next;
            }

            curr.next = new Nodo(curr.next, item);



        }
        size++;

    }

    @Override
    public List<D> cassetto(int index){
        List<D> ret = new ArrayList<>();
        if(index < 0 || index > getNumCassetti()) throw new IllegalArgumentException();

        int indiceIniziale = getCapCassetti() * index;
        int indiceFinale = indiceIniziale + getNumCassetti();

        Nodo curr = head;
        int count = 0;
        while(curr != null && count < indiceFinale){
            if(count >= indiceIniziale){
                ret.add(curr.info);
            }
            curr = curr.next;
            count++;
        }
        return ret;
    }

    @Override
    public Iterator<D> iterator(){

        return new Iterator<D>(){
            Nodo prec = null;
            Nodo curr = null;
            boolean removable = false;

            @Override
            public boolean hasNext(){
                if(curr == null){
                    return head != null;
                }
                return curr.next != null;
            }

            @Override
            public D next(){
                if(!hasNext()) throw new IllegalArgumentException();
                removable = true;
                if(curr == null){
                    curr = head;
                }else{
                    prec = curr;
                    curr = curr.next;
                }
                return curr.info;
            }

            @Override
            public void remove(){

                if(!removable) throw new NoSuchElementException();
                //RIMOZIONE IN TESTA
                if(prec == null){
                    head = curr.next;
                    if(head == null){
                        tail = null;
                }
                    //RIMOZIONE IN CODA
                }else if(curr == tail){
                    tail = prec;
                    prec.next = null;
                }else{   // RIMOZIONE IN MEZZO
                    prec.next = curr.next;
                }
                removable = false;
                curr = prec;
                size--;

            }
        };



    }

}
