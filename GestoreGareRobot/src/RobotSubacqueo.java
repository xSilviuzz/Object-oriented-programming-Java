public class RobotSubacqueo extends Robot {

    public RobotSubacqueo(String nome, String categoria, double energia, int posizione) {
        if (!categoria.equalsIgnoreCase("Subacqueo")) {
            throw new IllegalArgumentException("Categoria non valida");
        }
        super(nome, categoria, energia, posizione);
    }

    public void muoviti() {
        if (energia > 2.0) {
            energia -= 2.0;
            posizione += 7;
        } else throw new IllegalArgumentException("Energia finita");
    }

    public String prendiOggetto(String oggetto) {
        if (oggetto.equals("alga")) {
            posizione -= 3;
            return ("\nHai trovato un'alga,hai perso velocità, posizione attuale: " + posizione);
        } else return ("\nHai trovato " + oggetto);

    }

    public String info(){
        return(
                        "\n===RobotSubacqueo==="+
                        "\nNome: "+nome+
                        "\nCategoria: "+categoria+
                        "\nEnergia: "+energia+
                        "\nPosizione: "+posizione
        );
    }

}


