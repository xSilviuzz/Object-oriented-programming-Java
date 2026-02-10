import java.util.Objects;

public abstract class AbstractFarmaco implements Farmaco{

    private final NomeCommerciale nome;
    private final Data scadenza;
    private final Data produzione;
    private final PrincipioAttivo principio;

    public AbstractFarmaco(NomeCommerciale nome, Data scadenza, Data produzione, PrincipioAttivo principio){
        this.nome = nome;
        this.scadenza = scadenza;
        this.produzione = produzione;
        this.principio = principio;
    }

    @Override
    public NomeCommerciale getNome(){
        return nome;
    }
    @Override
    public Data dataScadenza(){
        return scadenza;
    }
    @Override
    public Data dataProduzione(){
        return produzione;
    }
    @Override
    public PrincipioAttivo getPrincipio(){
        return principio;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        AbstractFarmaco that = (AbstractFarmaco) o;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(scadenza, that.scadenza) && Objects.equals(produzione, that.produzione) && Objects.equals(getPrincipio(), that.getPrincipio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), scadenza, produzione, getPrincipio());
    }

    @Override
    public String toString(){
        return("\nFARMACO: "+nome+
                "\nScadenza: " +scadenza+
                "\nProduzione: "+produzione+
                "\nPrincipio attivo: "+principio);
    }
}
