import java.util.NoSuchElementException;

public record Anno(int anno) {

    public Anno{
        if(anno < 1453 || anno > 2100) throw new IllegalArgumentException();
    }
}
