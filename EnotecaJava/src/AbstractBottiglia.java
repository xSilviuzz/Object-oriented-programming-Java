import java.util.*;

public abstract class AbstractBottiglia implements Bottiglia {

    private final Etichetta etichetta;
    private final Anno annoVend;
    private final Anno annoImb;
    private final Produttore produttore;


    protected AbstractBottiglia(Etichetta etichetta, Anno annoVend, Anno annoImb, Produttore produttore){
        this.etichetta = etichetta;
        this.annoVend = annoVend;
        this.annoImb = annoImb;
        this.produttore = produttore;
    }

    @Override
    public Etichetta getNomeCommerciale(){
        return etichetta;
    }
    @Override
    public Anno annoVendemmia(){
        return annoVend;
    }
    @Override
    public Anno annoImbottigliamento(){
        return annoImb;
    }
    @Override
    public Produttore getProduttore(){
        return produttore;
    }

    public String toString(){
        return( "\nEtichetta: "+etichetta.val()+
                "\nAnno vendita: "+annoVend.val()+
                "\nAnno imbottigliamento: "+annoImb.val()+
                "\nProduttore: "+produttore.val());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        AbstractBottiglia that = (AbstractBottiglia) o;
        return Objects.equals(etichetta, that.etichetta) && Objects.equals(annoVend, that.annoVend) && Objects.equals(annoImb, that.annoImb) && Objects.equals(getProduttore(), that.getProduttore());
    }

    @Override
    public int hashCode() {
        return Objects.hash(etichetta, annoVend, annoImb, getProduttore());
    }
}
