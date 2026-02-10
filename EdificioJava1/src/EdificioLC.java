import java.util.*;

public class EdificioLC<U extends UnitaImmobiliare> extends AbstractEdificio<U>{

    private int size;
    public EdificioLC(String codEd, TipoEdificio tipoEdificio) {
        super(codEd, tipoEdificio);
        this.size = 0;
    }

    public int getSize() {
        return size;
    }


    protected class Nodo{
        Nodo next;
        U info;

        public Nodo(Nodo next, U info){
            this.next = next;
            this.info = info;
        }
    }

    private Nodo head = null;


    @Override
    public void add(U item){
        if(item == null) throw new NullPointerException();
        if(!item.getTipoUnita().equals(getTipoEdificio())) throw new IllegalArgumentException();
        Nodo daIns = new Nodo(null,item);
        if(head == null || head.info.compareTo(item) > 0){
            daIns.next = head;
            head = daIns;
        }else{
            Nodo curr = head;
            while(curr.next != null && curr.next.info.compareTo(item) < 0){
                curr = curr.next;
            }
            daIns.next = curr.next;
            curr.next = daIns;
        }
        size++;
    }

    @Override
    public Iterator<U> iterator(){
        return new Iterator<U>() {
            Nodo curr;
            Nodo prec;
            boolean removable = false;

            @Override
            public boolean hasNext() {
                if(curr == null){
                    return head != null;
                }else{
                    return curr.next != null;
                }
            }

            @Override
            public U next() {
                if(!hasNext()) throw new NoSuchElementException();
                removable = true;

                if(curr==null){
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
                size--;
                curr = prec;

            }
        };
    }




}
