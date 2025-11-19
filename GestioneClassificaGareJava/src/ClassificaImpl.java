import java.util.TreeSet;

public class ClassificaImpl implements Classifica{

    TreeSet<Atleta> classifica = new TreeSet<>();







    @Override
    public String aggiungiAtleta(Atleta a) {
        classifica.add(a);
        return "Atleta aggiunto";
    }

    @Override
    public String rimuoviAtleta(Atleta a) {
        classifica.remove(a);
        return "Atleta rimosso";
    }

    @Override
    public String classifica() {

        for(Atleta atleta : classifica){
            System.out.println(atleta);
        }

        return "\n===Terminata===\n";
    }
}
