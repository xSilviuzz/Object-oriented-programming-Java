public class Utente {
    private String name;
    private String acc;

    public Utente(String name, String acc) {
        if(name == null) throw new IllegalArgumentException("Nome non valido");
        if(acc == null) throw new IllegalArgumentException("Data non valida");
        this.name = name;
        this.acc = acc;
    }


    @Override
    public String toString() {
        return "Utente: {" +
                "Nome= " + name +" Data: "+acc+
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAcc() {
        return acc;
    }


}
