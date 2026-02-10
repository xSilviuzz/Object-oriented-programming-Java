import java.util.NoSuchElementException;

public record Titolo(String titolo) {

    public Titolo{
        if(titolo == null) throw new NoSuchElementException();
    }

}
