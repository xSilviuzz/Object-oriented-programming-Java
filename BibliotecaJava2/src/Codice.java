public record Codice(String val) {
    public Codice{
        if(val == null || val.isBlank()) throw new IllegalArgumentException();
        if(!val.matches("^[L-R-T]-[0-9]{4}")) throw new IllegalArgumentException();
    }
}
