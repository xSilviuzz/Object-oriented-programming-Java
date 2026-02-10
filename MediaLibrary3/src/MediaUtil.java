import java.io.*;
import java.util.*;

public class MediaUtil {

    public void stampaReport(List<? extends Scaffale> scaffali, PrintWriter pw){
        pw.write("REPORT SCAFFALI");
        for(Scaffale s : scaffali){
            pw.println(s);
        }
    }

}
