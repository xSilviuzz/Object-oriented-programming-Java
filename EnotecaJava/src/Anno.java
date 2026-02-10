public record Anno(int val) {
    public Anno(int val) {
        if(val < 1700 || val > 2030) throw new IllegalArgumentException("Anno non valido");
        this.val = val;
    }
}
