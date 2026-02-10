public record DataOra(String val) {

    public DataOra{
        if(val == null) throw new IllegalArgumentException("");
        if(!val.matches("^[0-31]{1}/[0-12]{1}/[2000-2100]{1}/[00-23]{1}:[00-59]$")) throw new IllegalArgumentException("Data o Ora non valida");
    }
}
