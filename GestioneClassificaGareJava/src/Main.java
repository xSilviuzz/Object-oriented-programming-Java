//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassificaImpl classifica = new ClassificaImpl();

        Atleta a1 = new Atleta("Nic1", 23.0);
        Atleta a2 = new Atleta("Nic2", 43.0);
        Atleta a3 = new Atleta("Nic3", 99.0);

        System.out.println(classifica.aggiungiAtleta(a1));
        System.out.println(classifica.aggiungiAtleta(a2));
        System.out.println(classifica.aggiungiAtleta(a3));




        Atleta a4 = new Atleta("NicElim", 90.0);
        System.out.println(classifica.rimuoviAtleta(a4));


        System.out.println(classifica.classifica());


    }
}
