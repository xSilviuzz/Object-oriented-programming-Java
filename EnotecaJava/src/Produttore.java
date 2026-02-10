public record Produttore(String val) {

    public Produttore(String val){

        if(val == null) throw new NullPointerException();
        if(!val.matches("[A-Za-z0-9]{3,20}")) throw new IllegalArgumentException("Produttore Stringa Alfanumerica");
        this.val = val;
    }


}
