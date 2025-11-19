public class Atleta implements Comparable<Atleta>{
    private String nome;
    private double punteggio;

    public Atleta(String nome, double punteggio) {
        if(nome == null) throw new IllegalArgumentException("Nome non valido");
        if(punteggio < 0 || punteggio > 100) throw new IllegalArgumentException("Punteggio non valido");

        this.nome = nome;
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return (
                "\nNome: "+nome+"\nPunteggio: "+punteggio
                );
    }

    public int compareTo(Atleta altro) {
        return Double.compare(altro.punteggio, this.punteggio);
    }
}
