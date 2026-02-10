import java.util.*;

public abstract class AbstractDispositivo implements Dispositivo{

    private final Codice codice;
    private final Anno annoProduzione;
    private final Anno annoAcquisto;
    private final Nominativo nominativo;


    public AbstractDispositivo(Codice codice, Anno annoProduzione, Anno annoAcquisto, Nominativo nominativo){
        this.codice = codice;
        this.annoProduzione = annoProduzione;
        this.annoAcquisto = annoAcquisto;
        this.nominativo = nominativo;
    }

    @Override
    public Codice getCodice(){
        return codice;
    }
    @Override
    public Anno annoProduzione(){
        return annoProduzione;
    }
    @Override
    public Anno annoAcquisto(){
        return annoAcquisto;
    }
    @Override
    public Nominativo getProduttore(){
        return nominativo;
    }


    @Override
    public String toString(){
        return("\nCodice: "+codice+"\nAnno produzione: "+annoProduzione+"\nAnno acquisto: "+annoAcquisto+"\nNominativo: "+nominativo);
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof AbstractDispositivo that)) return false;
        return Objects.equals(this.codice, that.codice) && Objects.equals(this.annoProduzione, that.annoProduzione) && Objects.equals(this.annoAcquisto, that.annoAcquisto) && Objects.equals(this.nominativo, that.nominativo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codice, annoProduzione, annoAcquisto, annoProduzione, nominativo);
    }




}
