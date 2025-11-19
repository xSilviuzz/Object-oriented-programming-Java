public interface Rubrica {
    String inserisciContatto(String nome, String numero);
    String aggiornaContatto(String nome, String numero);
    String trovaContatto(String nome);
    String rimuoviContatto(String nome);
    String infoRubrica();
}
