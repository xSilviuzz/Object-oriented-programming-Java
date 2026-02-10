import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class EnotecaUtil {

    public static void stampaInventario(List<? extends Cantinetta<? extends Bottiglia>> cantinette, PrintWriter pw){
        pw.write("Reporto delle cantinette");
        for(Cantinetta<? extends Bottiglia> cantinetta : cantinette ){
            for(Bottiglia bottiglia : cantinetta){
                pw.println(bottiglia.toString());
            }
        }
    }

    //Ci stanno assando un file le cui righe ETICHETTA; ANNO IMB; ANNO VENDEMMIA; PROD; CAT; TIPO

    public static List<Bottiglia> caricaBottiglie(File file) throws IOException{
        List<Bottiglia> ret = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] voci = line.split(";");
                if(voci.length != 6){
                    System.out.println("Linea Skippata errata");
                    continue;
                }

                String etichetta = voci[0];
                Etichetta e1 = new Etichetta(voci[0]);
                Anno aI = new Anno((Integer.parseInt(voci[1])));
                Anno aV = new Anno((Integer.parseInt(voci[2])));
                Produttore p = new Produttore(voci[3]);
                String tipo = voci[5];

                if(tipo.equalsIgnoreCase("VINO")){
                    Categoria<Vini> c = CategoriaVini.valueOf(voci[4]);
                    Vini v = new Vini(e1, aI, aV, p, c);
                    ret.add(v);
                }else{
                    System.out.println("Tipo non presente");
                    continue;
                }

            }
            return ret;
        }



    }
}
