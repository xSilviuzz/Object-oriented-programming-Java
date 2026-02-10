public class Main {

    public static void main(String[] args){
        Maglia m = new Maglia(
                new CodiceCapo("TS-001-A"),
                new Descrizione("Tshirt"),
                Taglia.M,
                Stagione.ESTATE,
                new Prezzo(29.90),
                TipoMaglia.CORTA
        );

        System.out.println(m);
// Output: Maglia[TS-001-A, "T-shirt cotone", M, ESTATE, 29.90€, Manica corta]

    }
}
