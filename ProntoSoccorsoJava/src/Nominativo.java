public record Nominativo(String val) {

    public Nominativo{
        if(val == null) throw new IllegalArgumentException("");
        if(!val.matches("^[a-zA-Z]{2,40}$")) throw new IllegalArgumentException("");
    }
}
