public interface StoricoAccessi {
    String aggiungiEvento(Utente utente);
    void rimuoviEvento();
    String cercaEvento(Utente utente);
    String visualizza();
}
