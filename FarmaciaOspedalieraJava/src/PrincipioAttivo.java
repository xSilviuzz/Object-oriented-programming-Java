public record PrincipioAttivo(String val) {

    public PrincipioAttivo{
        if(val == null) throw new NullPointerException();
        if(!val.matches("[A-Za-z]{3,10}")) throw new IllegalArgumentException();
    }


}
