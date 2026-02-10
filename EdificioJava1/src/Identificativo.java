public record Identificativo(String val) {
    public Identificativo{
        if(val == null) throw new NullPointerException();
        if(!val.matches("^[A-B-C]-[0-9]{2}-[A-B-C]")) throw new IllegalArgumentException();
    }
}
