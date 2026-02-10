public record Orario(Giorno gio, int ora, Minuti min) {
    public Orario{
        if(ora < 0 || ora > 23) throw new IllegalArgumentException("Ora non valida");
    }

    @Override
    public String toString(){
        return(gio+" "+ora+":"+min.getI());
    }
}
