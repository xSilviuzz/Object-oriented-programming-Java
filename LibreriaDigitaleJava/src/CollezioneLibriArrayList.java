import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollezioneLibriArrayList extends CollezioneLibriAbstract{

    ArrayList<Libro> coll = new ArrayList<>();

    @Override
    public void aggiungiLibro(Libro l) {
        coll.add(l);
    }

    public void ordina(){
        Collections.sort(coll);
    }

    @Override
    public String toString() {
        return "CollezioneLibriArrayList{" +
                "coll=" + coll +
                '}';
    }

    @Override
    public Iterator<Libro> iterator() {
        return coll.iterator();
    }


}
