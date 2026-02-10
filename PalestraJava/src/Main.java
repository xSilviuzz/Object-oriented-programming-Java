//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        System.out.println("Ciao");


        Orario o1 = new Orario(Giorno.LUN, 12,Minuti.QUARANTACINQUE);
        Intensita i1 = Intensita.Alta;
        Attrezzatura a1 = new Attrezzatura(Macchinario.Cyclette);
        CodiceCorso cod = new CodiceCorso(123);
        Cardio c1 = new Cardio(cod, "Ciaoo", 23, 3, o1, 60, i1, a1 );

        System.out.println(c1);
    }
}
