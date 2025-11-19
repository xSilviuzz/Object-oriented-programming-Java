import java.util.Objects;

public class RobotTerrestre extends Robot{

    public RobotTerrestre(String nome, String categoria, double energia, int posizione){

        if(!categoria.equalsIgnoreCase("Terrestre")){
            throw new IllegalArgumentException("Categoria non valida");
        }
        super(nome, categoria, energia, posizione);


    }

    public void muoviti(){
        if(energia>1.5){
            energia -= 1.5;
            posizione += 10;
        } else throw new IllegalArgumentException("Energia finita");
    }

    public String prendiOggetto(String oggetto){
        if(oggetto.equals("carburante")){
            energia += 3;
            return("\nHai trovato carburante energia attuale: "+energia);
        }else return("\nHai trovato "+oggetto);

    }


    public String info(){
        return(
                        "\n===RobotTerrestre==="+
                        "\nNome: "+nome+
                        "\nCategoria: "+categoria+
                        "\nEnergia: "+energia+
                        "\nPosizione: "+posizione
                );
    }




}
