public record Superficie(double val) {
    public Superficie{
        if(val < 20.0 || val > 2000.0) throw new IllegalArgumentException();
    }

    @Override
    public String toString(){
        return("Superficie: "+val+" m2");
    }
}
