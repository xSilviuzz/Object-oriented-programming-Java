


import java.util.Iterator;
import java.util.NoSuchElementException;


public class CollezioneLibriLC extends CollezioneLibriAbstract{



    public class Nodo{
        Libro l;
        Nodo next;

        public Nodo(Libro l){
            this.l = l;
            this.next = null;
        }
    }

    private Nodo head;



    @Override
    public void aggiungiLibro(Libro l) {
        Nodo nuovoNodo = new Nodo(l);

        //Se la testa è vuota aggiungo in testa
        if(head == null){
            head = nuovoNodo;
        }else{
            //Altrimenti aggiorno il puntatore e definisco la nuova testa
            nuovoNodo.next = head;
            head = nuovoNodo;
        }
    }


    private class IteratoreLC implements Iterator<Libro>{
        Nodo precedente = null;
        Nodo corrente = head;
        Nodo ultimoVisitato = null;   //Ultimo restituito da next();

        @Override
        public boolean hasNext(){
            if(corrente == null){
                return false;
            }else{
                return true;
            }
        }

        @Override
        public Libro next(){
            if(corrente == null){
                throw new NoSuchElementException();
            }else{
                precedente =  ultimoVisitato;
                ultimoVisitato = corrente;
                corrente = corrente.next;
                return ultimoVisitato.l;
            }
        }

        @Override
        public void remove(){
            if(corrente == null){
                throw new NoSuchElementException();
            }else{
                precedente.next = corrente;
            }
            ultimoVisitato = null;
        }
    }


    @Override
    public Iterator<Libro> iterator() {
        return new IteratoreLC();
    }

    @Override
    public String toString() {
        return "CollezioneLibriLC{" +
                "head=" + head +
                '}';
    }
}
