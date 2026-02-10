public record Anno(int val) {
    public Anno{
        if(val < 1800 || val > 2100) throw new IllegalArgumentException();
    }
}
