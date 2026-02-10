import java.util.*;

public class OspedaleLC implements Ospedale{

    private String nome;
    public OspedaleLC(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public class Nodo{
        Nodo next;
        Reparto info;

        public Nodo(Nodo next, Reparto info){
            this.next = next;
            this.info = info;
        }
    }

    private Nodo head;
    int size = 0;

    @Override
    public void aggiungiReparto(Reparto r){
        Nodo daAgg = new Nodo(null, r);
        if(head == null || head.info.compareTo(daAgg.info) > 0){
            daAgg.next = head;
            head = daAgg;
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.next.info.compareTo(daAgg.info) < 0){
                curr = curr.next;
            }
            daAgg.next = curr.next;
            curr.next = daAgg;
        }
        size++;
    }

    @Override
    public Iterator<Reparto> iterator(){
        return new Iterator<Reparto>(){
          Nodo curr = null;
          Nodo prec = null;
          boolean removable = false;

            @Override
            public boolean hasNext(){
                if(curr == null){
                    return head != null;
                }else{
                    return curr.next != null;
                }
            }

            @Override
            public Reparto next(){

                if(!hasNext()) throw new NoSuchElementException();
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
                if(!removable) throw new IllegalArgumentException();

                if(prec == null){
                    head = curr.next;
                }else{
                    prec.next = curr.next;
                }
                removable = false;
                curr = prec;
                size--;

            }

        };
    }

}
