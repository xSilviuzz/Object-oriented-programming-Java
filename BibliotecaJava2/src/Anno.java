public record Anno(int val) {
    public Anno{
        if(val < 1500 || val > 2026) throw new IllegalArgumentException();
    }
}
