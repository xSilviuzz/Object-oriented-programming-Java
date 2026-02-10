public record CapacitaPazienti(int val) {
    public CapacitaPazienti{
        if(val < 2 || val > 120) throw new IllegalArgumentException();
    }
}
