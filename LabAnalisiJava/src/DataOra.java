public record DataOra(int val) {
    public DataOra{
        if(val < 2000 || val > 2100) throw new IllegalArgumentException("Data non valida");
    }
}
