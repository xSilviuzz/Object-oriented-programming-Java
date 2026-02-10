public record Nominativo(String val) {
    public Nominativo{
        if(val == null) throw new NullPointerException();
        if(!val.matches("[a-zA-Z\\s]{1,30}")) throw new IllegalArgumentException();
    }
}
