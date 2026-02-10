import java.util.List;

public class ScaffaleLC<S extends Supporto> implements Scaffale<S> {

    public class Nodo {
        Nodo prossimo;
        S dato;

        public Nodo(Nodo prossimo, S dato) {
            this.prossimo = prossimo;
            this.dato = dato;
        }
    }

    private int numSupporti;
    private int numMens;
    private int capMens;
    private int size;
    private Nodo testa;

    public ScaffaleLC(int numSupporti, int numMens, int capMens, int size) {
        this.numSupporti = numSupporti;
        this.numMens = numMens;
        this.capMens = capMens;
        this.size = size;
    }

    @Override
    public void add(S item) {
        int capTot = numMens * capMens;
        if (size >= capTot) {
            throw new IllegalArgumentException("Spazio non disponibile");
        }

        Nodo n = new Nodo(null, item);
        String nuovoNome = n.dato.getAutore().nominativo();

        // Caso 1: lista vuota o inserimento in testa
        if (testa == null ||
                testa.dato.getAutore().nominativo().compareTo(nuovoNome) > 0) {
            n.prossimo = testa;
            testa = n;
        } else {
            // Caso 2: inserimento in mezzo o in coda
            Nodo corrente = testa;
            // mi fermo quando il prossimo ha nome maggiore del nuovo
            while (corrente.prossimo != null &&
                    corrente.prossimo.dato.getAutore().nominativo()
                            .compareTo(nuovoNome) <= 0) {
                corrente = corrente.prossimo;
            }
            // inserisco dopo 'corrente'
            n.prossimo = corrente.prossimo;
            corrente.prossimo = n;
        }

        size++;
    }

    @Override
    public boolean remove(S item) {
        if(testa == null) return false;

        if(testa.dato.equals(item)){
            testa = null;
            size--;
            return true;
        }

        Nodo curr = testa.prossimo;
        Nodo prec = testa;
        while(curr != null){
            if(curr.dato.equals(item)){
                prec.prossimo = curr.prossimo;
                size--;
                return true;
            }
            prec = curr;
            curr = curr.prossimo;
        }
        return false;
    }


    @Override
    public List<S> mensola(int index) {
        int temp = numMens;
        while(temp > 0){

        }
    }
}

