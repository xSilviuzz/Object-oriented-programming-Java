//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){


        RobotTerrestre rt1 = new RobotTerrestre("Luca", "Terrestre", 30.0, 0);
        RobotSubacqueo rs1 = new RobotSubacqueo("Silvio", "Subacqueo", 50.0, 0);

        GaraRobot gare = new GaraRobot();

        System.out.println(rt1.info());
        System.out.println(rs1.info());


        System.out.println(gare.eseguiTurno());

        System.out.println(rt1.info());
        System.out.println(rs1.info());

        System.out.println(gare.classifica());





    }


}
