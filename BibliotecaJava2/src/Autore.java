public record Autore(String val) {
    public Autore{
        if(val == null || val.isBlank()) throw new IllegalArgumentException();
        if(!val.matches("[a-zA-z/s]{0,50}")) throw new IllegalArgumentException();
    }
}
