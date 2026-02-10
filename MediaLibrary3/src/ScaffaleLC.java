import java.util.*;

public class ScaffaleLC<S extends Supporto> extends AbstractScaffale<S>{

    private int cod;
    private int numMens;
    private int capMens;
    private int size;
    private final Genere<S> genere;

    public ScaffaleLC(int numMens, int capMens,int cod, int size, Genere<S> genere) {
        super(numMens,capMens,cod,size);
        this.genere = genere;
    }

    public class Nodo{
        Nodo next;
        S info;
        public Nodo(Nodo next, S info){
            this.next = next;
            this.info = info;
        }
    }




    private Nodo head;
    private Nodo tail;


    @Override
    public void add(S item){
        int capTot = getCapMens() * getNumMens();

        if(size >= getCapMens() * getNumMens()) throw new IllegalArgumentException();
        if(!(item.getGenere().equals(this.genere))) throw new IllegalArgumentException();

        Nodo n = new Nodo(null, item);
        String nuovoNome = n.info.getAutore().val();

        if(head == null || head.info.compareTo(n.info) > 0){
            n.next = head;
            head = n;
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.info.compareTo(item) < 0){
                curr = curr.next;

            }
            n.next = curr.next;
            curr.next = n;
        }
        size++;
    }



    @Override
    public Iterator<S> iterator(){
        return new Iterator<S>(){
        Nodo curr;
        Nodo prec;
        boolean removable;

            @Override
            public boolean hasNext(){
                if(curr == null) {
                    return head != null;
                }else{
                    return curr.next != null;
                }
            }

            @Override
            public S next(){
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
