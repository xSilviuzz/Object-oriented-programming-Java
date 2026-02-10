public record CodiceCapo(String val) {
    public CodiceCapo{
        if(val == null) throw new NullPointerException();
        if(!val.matches("^[A-Z]{2}-[0-9]{3}-[A-Z]{1}"));
    }
}
