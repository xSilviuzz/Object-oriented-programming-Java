import java.util.*;
public class CantinettaLC<B extends Bottiglia> extends AbstractCantinetta<B> {

    public class Nodo {
        B info;
        Nodo next;

        public Nodo(B info, Nodo next) {
            this.info = info;
            this.next = next;
        }

    }

    private Nodo head = null;
    private int count = 0; // numero di bottiglie

    public CantinettaLC(Categoria<B> categoria, int numRipiani, int capRipiani, String cod) {
        super(categoria, numRipiani, capRipiani, cod);




    }

    @Override
    public void add(B item){
        if(item == null) throw new NullPointerException();
        if(count >= this.getNumRipiani() * this.getcapRipiani()) throw new RuntimeException();
        if(!item.getCategoria().equals(this.getCategoria())) throw new RuntimeException();
        if(head == null || head.info.compareTo(item) > 0){
            head = new Nodo(item, head);
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.next.info.compareTo(item) <0){
                curr = curr.next;
            }
            curr.next = new Nodo(item, curr.next);
        }
        count++;
    }
    @Override
    public boolean remove(B item){
        if(item == null || head == null) return false;
        if(head.info.equals(item)) {
            head = head.next;
        }else {
            Nodo curr = head;
            while (curr.next != null && !curr.next.info.equals(item)) {
                curr = curr.next;
            }
            if (curr.next == null) return false;
            curr.next = curr.next.next;
        }
        count--;
        return true;
    }
    @Override
    public List<B> ripiano(int index){
        if(index < 0 || index > this.getNumRipiani()) throw new IllegalArgumentException();
        List<B> ripiano = new ArrayList<>();
        int start = index * this.getcapRipiani();
        int end = start + this.getcapRipiani();
        int i = 0;
        Nodo curr = head;
        while(i < start && curr != null){
            i++;
            curr = curr.next;
        }
        while(i < end && curr != null){
            ripiano.add(curr.info);
            i++;
        }
        return ripiano;
    }

    @Override
    public Iterator<B> iterator(){

        return new Iterator<B>(){
            Nodo curr = null;
            Nodo prec = null;
            @Override
            public boolean hasNext(){
                if(curr == null){
                    return head != null;
                }
                return curr.next != null;
            }
            @Override
            public B next(){
                if(curr == null){
                    curr = head;
                }else{
                    prec = curr;
                    curr = curr.next;
                }
                return curr.info;
            }
        };
    }





    }




