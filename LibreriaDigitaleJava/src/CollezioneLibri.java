import java.util.Iterator;
import java.util.NoSuchElementException;

public interface CollezioneLibri extends Iterable<Libro>{

    void aggiungiLibro(Libro l);

    default boolean rimuoviLibro(Libro l){
        Iterator<Libro> jamu = iterator();
        while(jamu.hasNext()){
            Libro a = jamu.next();
            if(l.equals(a)){
                jamu.remove();
                return true;
            }
        }
        return false;
    }

    default Libro getLibro(int index){
        if(index < 0) throw new IllegalArgumentException();
        int count = 0;
        for(Libro l : this){
            if(index == count){
                return l;
            }
            count++;
        }
        throw new NoSuchElementException();
    }

    default int numeroLibri(){
        int count = 0;
        for(Libro l : this){
            count++;
        }
        throw new NoSuchElementException();
    }

    default int contaLibriAutore(String autore){
        int count = 0;
        for(Libro l : this){
            if((l.autore()).equals(autore)) count++;
        }
        return count;
    }

    default int pagineTotali(){
        int count = 0;
        for(Libro l : this){
            count += l.pagine();
        }
        return count;
    }

    default double pagineMedie(){
        int count = 0;
        for(Libro l : this){
            count += l.pagine();
        }
        int num = numeroLibri();
        return((double)count/(double)num);
    }



    default boolean collezioneCorposa(){
        int a = numeroLibri();
        if(a < 5) return false;     //1 vincolo


        int pagineTot = 0;
        for(Libro l : this){
           pagineTot += l.pagine();
        }
        if(pagineTot < 1000) return false;      //2 vincolo

        boolean flag = false;
        for(Libro l : this){
            if(l.annoPubblicazione() > 2015){
                flag = true;
                break;
            }
        }
        return flag; //3 vincolo
    }

}
