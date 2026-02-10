import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class CollezioneLibriAbstract implements CollezioneLibri{

    @Override
    public int numeroLibri() {
        return CollezioneLibri.super.numeroLibri();
    }
    @Override
    public int pagineTotali(){
        return CollezioneLibri.super.pagineTotali();
    }

    @Override
    public double pagineMedie() {
        return CollezioneLibri.super.pagineMedie();
    }

    @Override
    public int contaLibriAutore(String autore) {
        return CollezioneLibri.super.contaLibriAutore(autore);
    }

}
