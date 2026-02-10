public class Maglia extends AbstractCapo{

    private final TipoCapo<Maglia> tipo;

    public Maglia(CodiceCapo codice, Descrizione descrizione, Taglia taglia, Stagione stagione, Prezzo prezzo, TipoCapo<Maglia> tipo) {
        super(codice, descrizione, taglia, stagione, prezzo);
        this.tipo = tipo;
    }

    @Override
    public TipoCapo<Maglia> tipo(){
        return tipo;
    }

    public String toString(){
        return super.toString()+"Tipo: Maglia\nManica: "+tipo;
    }
}
