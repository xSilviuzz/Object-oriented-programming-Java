public record Descrizione(String val) {
    public Descrizione{
        if(val == null) throw new NullPointerException();
        if(val.length() < 5 || val.length() > 40) throw new IllegalArgumentException();
        if(!val.matches("[A-Za-z]+")) throw new IllegalArgumentException();
    }
}
