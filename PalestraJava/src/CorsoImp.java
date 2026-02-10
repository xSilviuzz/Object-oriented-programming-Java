public abstract class CorsoImp implements Corso{
    CodiceCorso codice;
    String nome;
    int capacitaMassima;
    int numeroIstruttori;
    Orario orario;
    int durataMinuti;
    Intensita intensita;

    public CorsoImp(CodiceCorso codice, String nome, int capacitaMassima, int numeroIstruttori, Orario orario, int durataMinuti, Intensita intensita){

        if(nome.length() < 5 || nome.length() > 20) throw new IllegalArgumentException("Nome non valido");
        if(capacitaMassima < 5 || capacitaMassima > 25)throw new IllegalArgumentException("Capacità non valida");
        if(numeroIstruttori < 1 || numeroIstruttori > 5)throw new IllegalArgumentException("Numero istruttori non validi");
        if(durataMinuti < 30 || durataMinuti > 120)throw new IllegalArgumentException("Durata non valida");

        this.codice = codice;
        this.nome = nome;
        this.capacitaMassima = capacitaMassima;
        this.numeroIstruttori = numeroIstruttori;
        this.orario = orario;
        this.durataMinuti = durataMinuti;
        this.intensita = intensita;
    }



    public int compareTo(CodiceCorso altro) {
        if(this.compareTo(altro) < 0){
            return -1;
        }
        if(this.compareTo(altro) > 0){
            return 1;
        }
        return 0;
    }
}
