public record Codice(String val){
    public Codice{
        if(val == null) throw new NullPointerException();
        if(val.isBlank()) throw new NullPointerException();
        if(val.matches("[0-9a-zA-Z]{3,12}")) throw new IllegalArgumentException();
    }
}
