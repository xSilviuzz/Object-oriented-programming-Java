import java.util.*;

public class ArmadioLC<F extends Farmaco> extends AbstractArmadio<F>{

    public class Nodo{
        F info;
        Nodo next;
        public Nodo(F info, Nodo next){
            this.info = info;
            this.next = next;
        }
    }

    private Nodo head;
    private int count = 0;

    public ArmadioLC(int numRipiani, int capRipiani, String cod, ClasseTerapeutica<F> cla){
        super(numRipiani, capRipiani, cod, cla);
        head = null;
    }

    @Override
    public void add(F item){
        if(item == null) throw new IllegalArgumentException();
        if(count >= this.getCapRipiani() * this.getNumRipiani()) throw new IllegalArgumentException();
        if(!item.getClasse().equals(this.getCla())) throw new IllegalArgumentException();

        if(head == null || head.info.compareTo(item) > 0){
            head = new Nodo(item, head);
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.next.info.compareTo(item) < 0){
                curr = curr.next;
            }
            curr.next = new Nodo(item, curr.next);
        }

        count++;
    }


    @Override
    public boolean remove(F item){
        if(item == null) throw new IllegalArgumentException();
        if(head.info.equals(item)){
            head = head.next;
        }else{
            Nodo curr = head;
            while(curr.next != null && !curr.next.info.equals(item)){
                curr = curr.next;
            }
            if(curr.next == null) return false;
            curr.next = curr.next.next;
        }
        count--;
        return true;

    }


    @Override
    public List<F> ripiano(int index){
        List<F> ret = new ArrayList<>();
        Nodo curr = head;
        if(index == 0){
            curr = head;
        }else{
            while(curr.next != null){
                curr = curr.next;
            }
        }
        if(curr == null) throw new IllegalArgumentException();
        ret.add(curr.info);
    }


    @Override
    public Iterator<F> iterator(){



    }


}
