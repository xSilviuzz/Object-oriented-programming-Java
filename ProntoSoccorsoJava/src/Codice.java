public record Codice(String val) {

    public Codice{
        if(val == null) throw new NullPointerException();
        if(!val.matches("^[a-zA-Z0-9]{6,10}$")) throw new IllegalArgumentException("Codice non valido");
    }

}
