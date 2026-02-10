public record Codice(String val) {
    public Codice{
        if(val == null) throw new NullPointerException();
        if(!val.matches("[A-za-z0-9]{3,12}")) throw new IllegalArgumentException();
    }
}
