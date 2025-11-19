public abstract class Robot implements Comparable<Robot>{

    protected  String nome;
    protected  String categoria;
    protected double energia;
    protected  int posizione;

    public Robot(String nome, String categoria, double energia, int posizione) {
        this.nome = nome;
        this.categoria = categoria;
        if(energia<0.0) throw new IllegalArgumentException("Energia non valida");
        this.energia = energia;
        if(posizione<0) throw new IllegalArgumentException("Posizione non valida");
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getEnergia() {
        return energia;
    }

    public int getPosizione() {
        return posizione;
    }

    public abstract void muoviti();
    public abstract String prendiOggetto(String oggetto);
    public abstract String info();


    public int compareTo(Robot altro){
        if(this.getPosizione() < altro.getPosizione()){
            return -1;
        }
        if(this.getPosizione() > altro.getPosizione()){
            return 1;
        }
        return 0;
    }
}
