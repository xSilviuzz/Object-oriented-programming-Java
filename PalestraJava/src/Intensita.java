public enum Intensita{
    Bassa(1),
    MedioBassa(2),
    Medio(3),
    Alta(4),
    Altissima(5);

    private final int i;

    Intensita(int i){
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
