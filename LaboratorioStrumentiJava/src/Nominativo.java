public record Nominativo(String val) {
    public Nominativo{
        if(val == null) throw new NullPointerException();
        if(val.isBlank()) throw new NullPointerException();
        if(!val.matches("[A-Za-z0-9 ]+")) throw new IllegalArgumentException();
    }
}
