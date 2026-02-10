public class SANGUE extends AbstractCampione{

    private final Esame<SANGUE> esame;

    public SANGUE(Codice c, Nominativo n, DataOra dat, TipoCampione tip, Urgenza u, Esame<SANGUE> esame) {
        super(c, n, dat, tip, u);
        this.esame = esame;
    }

    @Override
    public Esame<SANGUE> getEsame() {
        return esame;
    }
}
