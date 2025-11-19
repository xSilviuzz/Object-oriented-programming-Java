import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public void main(String[] args){

        Contatto rub = new Contatto();


        System.out.println(rub.inserisciContatto("Nico","3313819631"));
        System.out.println(rub.inserisciContatto("Nic","3313819632"));
        System.out.println(rub.inserisciContatto("ico","3313819633"));
        System.out.println(rub.inserisciContatto("Nio","3313819634"));



        System.out.println(rub.infoRubrica());


    }
}
