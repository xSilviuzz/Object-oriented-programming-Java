import java.io.*;
import java.util.*;

public class OspedaleUtil {



    public static void stampaReportOspedaliero(List<? extends Ospedale> ospedali, PrintWriter pw){

        pw.write("REPORT OSPEDALIERO");

        for(Ospedale o : ospedali){
            pw.println(o);
        }


    }
}
