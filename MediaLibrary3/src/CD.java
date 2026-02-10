public class CD extends AbstractSupporto{

    private final GenereCD genere;

    public CD(Titolo t, Anno aE, Anno aA, Nominativo aut, GenereCD genere) {
        super(t, aE, aA, aut);
        this.genere = genere;
    }


    public GenereCD getGenere() {
        return genere;
    }

}
