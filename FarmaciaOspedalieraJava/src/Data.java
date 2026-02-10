public record Data(String val) {

    public Data{
        if(val == null) throw new NullPointerException();
        if(!val.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) throw new IllegalArgumentException();
    }

}
