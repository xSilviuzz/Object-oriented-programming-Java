public record CodiceReparto(String val) {
    public CodiceReparto{
        if(val == null || val.isBlank()) throw new NullPointerException();
        if(!val.matches("[A-Z]{3}[0-9]{3}")) throw new IllegalArgumentException();
    }
}
