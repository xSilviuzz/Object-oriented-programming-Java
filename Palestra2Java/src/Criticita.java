public enum Criticita {

    basso(1),
    medio(2),
    medioalto(3),
    alto(4),
    altissimo(5);

    private final int val;

    Criticita(int val){
        this.val = val;
    }

    public int val(){
        return this.val;
    }
}
