public record Etichetta(String val) {
    public Etichetta(String val){
        if(val == null) throw new IllegalArgumentException("Etichetta nulla");
        if(val.isBlank()) throw new IllegalArgumentException("Stringa vuota o composta da spazi");
        if(!val.matches("^[A-Za-z0-9\s]{4,10}")) throw new IllegalArgumentException("Etichetta non valida");
        this.val = val;

    }
}
