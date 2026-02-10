public record NomeReparto(String val) {
    public NomeReparto{
        if(val == null || val.isBlank()) throw new NullPointerException();
        if(!val.matches("^[A-Za-z][0-9]{4,50}")) throw new IllegalArgumentException();
    }
}
