import java.util.*;
import java.io.*;

public class LabUtil {

    public static void StampaLab(List<? extends Armadio<? extends Dispositivo>> armadi, PrintWriter pw){

        for(Armadio<? extends Dispositivo> a : armadi){
            pw.print("Armadio: ");
            for(Dispositivo d : a){
                pw.println(d);
            }
        }
    }

    public static List<Dispositivo> caricadafile(File file) throws IOException{
        List<Dispositivo> ret = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;
            while((line = br.readLine()) != null){
                String[] parti = line.split(";");
                if(parti.length != 6){
                    continue;
                }
                Codice c = new Codice(parti[0]);
                Anno aP = new Anno(Integer.parseInt(parti[1]));
                Anno aA = new Anno(Integer.parseInt(parti[2]));
                Nominativo n = new Nominativo(parti[3]);
                String tipo = parti[5];
                if(tipo.equalsIgnoreCase("SENSORE")) {
                    Famiglia<Sensore> f = FamigliaSensore.valueOf(parti[4]);
                    Sensore s = new Sensore(c,aP,aA,n,f);
                    ret.add(s);
                }else if(tipo.equalsIgnoreCase("MICROCONTROLLORI")) {
                    Famiglia<Microcontrollori> f = FamigliaMicrocontrollori.valueOf(parti[4]);
                    Microcontrollori s = new Microcontrollori(c,aP,aA,n,f);
                    ret.add(s);
                }

            }

        }
        return ret;
    }
}
