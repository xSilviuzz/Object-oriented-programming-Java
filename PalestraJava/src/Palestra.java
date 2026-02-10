import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public interface Palestra extends Iterable<Corso>{
    void aggiungiCorso(Corso c);

    default boolean rimuoviCorso(Corso c){
        Iterator<Corso> jamu = iterator();

        while(jamu.hasNext()){
            Corso cc = jamu.next();
            if(c.equals(cc)){
                jamu.remove();
                return true;
            }
        }
        return false;
    }

    default Corso getCorso(int index){
        Iterator<Corso> jamu = iterator();
        int i = 0;
        Corso ret = null;
        while (jamu.hasNext()){
            if(i == index){
                ret = jamu.next();
            }
            i++;
        }
        return ret;
    }

    default double rapportoIstrPartecipanti(){
        Iterator<Corso> jamu = iterator();
        Corso c = null;
        int sumIstr = 0;
        int sumCap = 0;
        while(jamu.hasNext()){
            c = jamu.next();
            sumIstr += c.numeroIstruttori();
            sumCap += c.capacitaMassima();
        }
        return( (double)sumIstr/(double)sumCap);
    }

    default boolean verificaStandardQualita(){
        Iterator<Corso> jamu = iterator();
        int capTot = 0;

        double rapp = 0.0;
        int sumIstr = 0;
        int sumCap = 0;

        boolean inte = false;

        Set<String> tipi = new HashSet<>();

        while (jamu.hasNext()){
            Corso c = jamu.next();

            if(c instanceof Cardio){
                tipi.add("Cardio");
            }
            if(c instanceof Forza){
                tipi.add("Forza");
            }
            if(c instanceof Benessere){
                tipi.add("Benessere");
            }







            sumIstr += c.numeroIstruttori(); //rapp istr partec
            sumCap += c.capacitaMassima();

            capTot += c.capacitaMassima();  //Capacità totale

            if(c.intensita().equals(Intensita.Alta)){
                if(c.numeroIstruttori() < 2){
                    return false;
                }else inte = true;
            }





        }


        return inte;
    }




}
