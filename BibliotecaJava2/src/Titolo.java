public record Titolo(String val) {
    public Titolo{
        if(val == null || val.isBlank()) throw new IllegalArgumentException();
        if(!val.matches("^[0-9a-zA-z][a-zA-z]{3,100}")) throw new IllegalArgumentException();
    }
}
