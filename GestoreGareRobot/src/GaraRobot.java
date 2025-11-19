import java.util.ArrayList;
import java.util.Collections;

public class GaraRobot{

    private ArrayList<Robot> robotList = new ArrayList<Robot>();

    public GaraRobot() {
        robotList.add(new RobotTerrestre("Luca", "Terrestre", 30.0, 0));
        robotList.add(new RobotSubacqueo("Silvio", "Subacqueo", 50.0, 0));
    }


    public String eseguiTurno(){

        for(int i = 0; i < robotList.size(); i++){
            if(robotList.get(i).getEnergia() > 0){
                robotList.get(i).muoviti();
                System.out.println("Turno eseguito per "+robotList.get(i).getNome());
            } else{

                System.out.println("Energia finita, posizione di "+robotList.get(i).getNome()+" posizione: "+robotList.get(i).getPosizione());
            }
        }
        return ("Turno finito");
    }



    public String classifica(){
        Collections.sort(robotList);
        System.out.println("===CLASSIFICA ATTUALE===");
        for(int i = 0; i < robotList.size(); i++){

            System.out.println(
                    "\n"+robotList.get(i).getNome()+" "+robotList.get(i).getPosizione()+"\n"



            );
        }
        return(".");
    }



}
