public record Anno(int val) {
    public Anno{
        if(val < 1950 || val > 2100) throw new IllegalArgumentException();
    }
}
