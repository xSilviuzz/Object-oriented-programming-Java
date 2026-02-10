public record Prezzo(double val) {
    public Prezzo{
        if(val < 1.0 || val > 500.0) throw new IllegalArgumentException();
    }
}
