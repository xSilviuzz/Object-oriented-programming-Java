import java.util.*;
import java.io.*;

public class ArmadioUtil {

    public static <A extends Armadio<?>> void scriviReport(List<A> armadi, PrintWriter pw){

        pw.println("REPORT ARMADI");
        int count = 1;
        for(A a : armadi){
            pw.println("ARMADIO "+count);
            pw.println(a.valoreTotale());
            pw.println(a);
            pw.println();
            count++;
        }
        pw.flush();
    }

    public static <A extends Armadio<?>> void esportaArmadi(List<A> armadi, File nomeFile)
            throws IOException{

        try(PrintWriter pw = new PrintWriter(new FileWriter(nomeFile))){
            int count = 1;
            for(A armadio : armadi){
                pw.println("ARMADIO: ARM-"+count);
                pw.println(armadio.valoreTotale());
                pw.println(armadio);
                count++;
            }

            pw.flush();
        }

    }


    public static List<Capo> importaCapi(File nomeFile) throws IOException{
        List<Capo> ret = new ArrayList<Capo>();


        try(BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String line;
            while((line = br.readLine()) != null){
                if(line.startsWith("ARMADIO")) continue;
                if(line.startsWith("CONFIG")) continue;
                if(line.startsWith("VALORE")) continue;
                if(line.startsWith("C")){
                    String[] parti = line.split(";");
                    if(parti.length < 8) continue;
                    CodiceCapo codice = new CodiceCapo(parti[1]);
                    Descrizione descrizione = new Descrizione(parti[2]);
                    Prezzo pr = new Prezzo(Integer.parseInt(parti[5]));
                    Taglia taglia = Taglia.valueOf(parti[3]);
                    Stagione stagione = Stagione.valueOf(parti[4]);
                    String tipoCapo = parti[6];
                    String tipoSpecifico = parti[7];

                    if(tipoCapo.equals("MAGLIA")){
                        TipoCapo<Maglia> tc = TipoMaglia.valueOf(tipoSpecifico);
                        Maglia mg = new Maglia(codice,descrizione,taglia,stagione,pr,tc);
                        ret.add(mg);
                    }

                }

            }

        }catch (Exception e){
            System.out.println("Errore");
        }

    return ret;

    }


}
