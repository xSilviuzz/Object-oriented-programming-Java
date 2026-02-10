public record NomeCommerciale(String val) {

    public NomeCommerciale{
        if(val == null) throw new IllegalArgumentException();
        if(!val.matches("{A-Za-z}[2,10]")) throw new IllegalArgumentException();
    }


}
