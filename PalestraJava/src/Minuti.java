public enum Minuti {
    ZERO(0),
    QUINDICI(15),
    TRENTA(30),
    QUARANTACINQUE(45);

    private final int i;
    Minuti(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }
}
