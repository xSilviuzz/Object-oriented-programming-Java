import java.util.*;

public interface Ospedale extends Iterable<Reparto>{

    void aggiungiReparto(Reparto r);

    default boolean rimuoviReparto(Reparto r){
        Iterator<Reparto> it = iterator();

        while(it.hasNext()){
            Reparto curr = it.next();
            if(curr.equals(r)){
                it.remove();
                return true;
            }
        }

        return false;
    }

    default Reparto getReparto(int index){
        Iterator<Reparto> it = iterator();
        int count = 0;
        while(it.hasNext()){
            Reparto curr = it.next();
            if(count == index){
                return curr;
            }
            count++;
        }
        return null;
    }

    default double calcolaRatioMediciPazienti(){

        double totMed = 0;
        double totCapPaz = 0;
        double ratio = 0;
        for(Reparto r : this){

            totMed += r.medici();
            totCapPaz += r.capacita().val();
        }

        ratio = totMed / totCapPaz;
        return ratio;
    }


    default boolean verificaStandard(){

        if(this.calcolaRatioMediciPazienti() < 0.15) return false;

        int numTI = 0;
        double supTot = 0;

        for(Reparto r : this){
            if(r instanceof TerapiaIntensiva) numTI++;
            supTot += r.superficie().val();
        }

        if(numTI < 1) return false;
        if(supTot < 5000) return false;


        for(Reparto r : this){
            if(r.criticita().val() == 4 || r.criticita().val() == 5){
                if(r.medici() < 3) return false;
            }
        }
        return true;
    }

}
