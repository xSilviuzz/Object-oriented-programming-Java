import java.util.*;
import java.io.*;


public class CondominioUtil {

    public static <T extends Edificio> void scriviReport(List<T> edifici, String nomeFile) throws IOException{

        try(PrintWriter pw = new PrintWriter(new FileWriter(nomeFile))){

            pw.println("REPORT EDIFICI");

            for(T edificio: edifici){

                pw.println(edificio);

            }
            pw.flush();
        }

    }

    public static List<UnitaImmobiliare> leggiReport(String nomefile) throws IOException{

        String line;
        List<UnitaImmobiliare> ret = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nomefile))){

            while((line = br.readLine()) != null){
                if(line.startsWith("EDIFICIO")) continue;
                String[] voci = line.split(";");
                if(voci.length != 6) continue;

                Identificativo i1 = new Identificativo(voci[1]);
                Nominativo n1 = new Nominativo(voci[2]);
                Anno aC = new Anno(Integer.parseInt(voci[4]));
                Anno aQ = new Anno(Integer.parseInt(voci[5]));

                if(voci[3].equals("APPARTAMENTO")){
                    TipoEdificio tE = TipoEdificio.APPARTAMENTO;
                    TipoAppartamento tt = TipoAppartamento.CIVILE; //SCELGO UNO A CASO CAUSA INCOMPRENSIONI NELLA TRACCIA
                    Appartamento a1 = new Appartamento(i1,aC,aQ,n1,tt);
                    ret.add(a1);
                }
                if(voci[3].equals("BOX")){
                    TipoEdificio tE = TipoEdificio.BOX;
                    TipoBox tt = TipoBox.DOPPIO; //SCELGO UNO A CASO CAUSA INCOMPRENSIONI NELLA TRACCIA
                    Box a1 = new Box(i1,aC,aQ,n1,tt);
                    ret.add(a1);
                }
                if(voci[3].equals("CANTINA")){
                    TipoEdificio tE = TipoEdificio.CANTINA;
                    //NON AVENDO CREATO LA CLASSE CANTINA LASCIO STARE A FUTURE IMPL
                }

            }

            Collections.sort(ret);
            return ret;

        }

    }


}
