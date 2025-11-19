import java.util.HashMap;
import java.util.Map;

public class Contatto implements Rubrica{

    private String nome;
    private String num;


    HashMap<String, String> Rubrica1 = new HashMap<>();

    public String inserisciContatto(String nome, String num){
        if(nome == null){
            throw new IllegalArgumentException("Nome non valido");
        }
        if(num == null || num.length() != 10){
            throw new IllegalArgumentException("Numero non valido");
        }
        Rubrica1.put(nome, num);
        return ("Contatto inserito");
    }

    public String aggiornaContatto(String nome, String num){

        if(Rubrica1.containsKey(nome)==false){
            throw new IllegalArgumentException("Contatto inesistente");
        }else{
            Rubrica1.put(nome, num);
            return("\nContatto aggiornato\n"+Rubrica1.get(nome));
        }
    }


    @Override
    public String trovaContatto(String nome) {
        if(Rubrica1.containsKey(nome)==false){
            throw new IllegalArgumentException("Contatto inesistente");
        }else{
            return("\nNome: "+nome+"\nNumero: "+Rubrica1.get(nome));
        }
    }

    @Override
    public String rimuoviContatto(String nome) {
        if(Rubrica1.containsKey(nome)==false){
            throw new IllegalArgumentException("Contatto inesistente");
        }else{
            Rubrica1.remove(nome);
            return("Contatto rimosso");
        }
    }



    @Override
    public String infoRubrica() {       //METODO CHE MI CONSENTE DI ITERARE SULLA HASHMAP Ogni elemento del Set è un oggetto Map.Entry che rappresenta una coppia chiave-valore.
        for (Map.Entry<String, String> entry : Rubrica1.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue()+"\n");
        }
        return ("===Terminato===");
    }
}
