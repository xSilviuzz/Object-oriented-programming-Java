public record Nominativo(String val){
    public Nominativo{
        if(val == null) throw new NullPointerException();
        if(val.isBlank()) throw new NullPointerException();
        if(val.matches("[a-zA-z/s]{2,40}")) throw new IllegalArgumentException();
    }
}
