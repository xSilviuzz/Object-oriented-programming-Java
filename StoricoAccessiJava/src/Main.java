//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

    StoricoAccessiImp storico = new StoricoAccessiImp();

    Utente u1 = new Utente("Nico", "16/10");
    Utente u2 = new Utente("Silvio", "17/10");
    Utente u3 = new Utente("Luca", "18/10");

    System.out.println(storico.aggiungiEvento(u1));
    System.out.println(storico.aggiungiEvento(u2));
    System.out.println(storico.aggiungiEvento(u3));

    System.out.println(storico.visualizza());

    storico.rimuoviEvento();

    System.out.println(storico.visualizza());

    Utente u5 = new Utente("Giovanni", "19/10");
    System.out.println(storico.aggiungiEvento(u5));

    System.out.println(storico.visualizza());

    storico.rimuoviEvento();
    System.out.println(storico.visualizza());

    System.out.println(storico.cercaEvento(u2));

    }
}
