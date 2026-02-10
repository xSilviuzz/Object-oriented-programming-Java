import java.util.ArrayList;
import java.util.List;

public class AreaGestioneImpl<A extends AccessoPS> extends AreaGestioneAbstract<A>{

    private final List<List<A>> aree;

    public AreaGestioneImpl(int numeroStanze, int capienzaPerStanza, String codice){
        super(numeroStanze, capienzaPerStanza, codice);

        aree = new ArrayList<List<A>>(numeroStanze);


        for(int i = 0; i < numeroStanze; i++){
            aree.add(new ArrayList<A>());
        }

    }

    @Override
    public List<A> stanza(int index){
        if(index < 0 || index > this.getNumeroStanze()){
            throw new IllegalArgumentException("a");
        }
        return new ArrayList<A>(aree.get(index));
    }



}
