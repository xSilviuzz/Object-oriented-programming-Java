import java.util.Iterator;
import java.util.LinkedList;

public class StoricoAccessiImp implements StoricoAccessi {

    LinkedList<Utente> accessi = new LinkedList<>();


    @Override
    public String aggiungiEvento(Utente utente) {
        accessi.addFirst(utente);
        return "Utente aggiunto\n";
    }

    @Override
    public void rimuoviEvento() {
        if (accessi.size() > 3) {
            System.out.println("Rimosso utente causa overflow: " + accessi.removeLast()+"\n");
        }else System.out.println("Spazio ancora disponibile non necessaria rimozione\n");

    }


    @Override
    public String cercaEvento(Utente utente) {
        StringBuilder rt = new StringBuilder();
        Iterator<Utente> iteratore = accessi.iterator();


        while (iteratore.hasNext()) {
            Utente utentecorrente = iteratore.next();
            if (utentecorrente.equals(utente)) {
                rt.append(utentecorrente).append("\n");
            }
        }


        return rt.toString();
    }

    @Override
    public String visualizza() {
        Iterator<Utente> iteratore = accessi.iterator();
        StringBuilder rt = new StringBuilder();
        while (iteratore.hasNext()) {
            Utente utentecorrente = iteratore.next();
            rt.append(utentecorrente).append("\n");



        }
        return rt.toString();
    }
}
