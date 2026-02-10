import java.util.NoSuchElementException;

public record Nominativo(String nominativo) {

    public Nominativo{
        if(nominativo == null) throw new NoSuchElementException();
    }

}
