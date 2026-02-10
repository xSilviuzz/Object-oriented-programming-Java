public interface Farmaco extends Comparable<Farmaco>{

    NomeCommerciale getNome();
    Data dataScadenza();
    Data dataProduzione();
    PrincipioAttivo getPrincipio();
    ClasseTerapeutica<? extends Farmaco> getClasse();

    @Override
    default int compareTo(Farmaco o){
        if(o == null) return 1;
        return this.getPrincipio().val().compareToIgnoreCase(o.getPrincipio().val());

    }

}
