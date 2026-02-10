public record Nominativo(String val) {
    public Nominativo{
        if(val == null) throw new NullPointerException();
        if(!val.matches("[a-zA-z/s]{3,10}")) throw new IllegalArgumentException();
    }
}
