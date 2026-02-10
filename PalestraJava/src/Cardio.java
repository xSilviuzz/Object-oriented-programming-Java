public class Cardio extends CorsoImp{

    private final Attrezzatura attrezzatura;
    public Cardio(CodiceCorso codice, String nome, int capacitaMassima, int numeroIstruttori, Orario orario, int durataMinuti, Intensita intensita, Attrezzatura attrezzatura) {
        super(codice, nome, capacitaMassima, numeroIstruttori, orario, durataMinuti, intensita);
        if(durataMinuti < 45)throw new IllegalArgumentException("Durata non valida min 45");
        this.attrezzatura = attrezzatura;
    }





    @Override
    public CodiceCorso codice(int cod) {
        return null;
    }

    @Override
    public String nome() {
        return "";
    }

    @Override
    public int capacitaMassima() {
        return 0;
    }

    @Override
    public int numeroIstruttori() {
        return 0;
    }

    @Override
    public Orario orario(String gio, int ora, Minuti min) {
        return null;
    }

    @Override
    public int durataMinuti() {
        return 0;
    }

    @Override
    public  Intensita intensita(){
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cardio{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", capacitaMassima=" + capacitaMassima +
                ", numeroIstruttori=" + numeroIstruttori +
                ", orario=" + orario +
                ", durataMinuti=" + durataMinuti +
                ", intensita=" + intensita +
                ", attrezzatura=" + attrezzatura +
                '}';
    }
}


