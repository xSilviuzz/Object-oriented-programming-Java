public interface UnitaImmobiliare extends Comparable<UnitaImmobiliare>{

    Identificativo getId();
    Anno annoCostruzione();
    Anno annoAcquisto();
    Nominativo getProprietario();
    Categoria<?> getCategoria();
    TipoEdificio getTipoUnita();

    default int compareTo(UnitaImmobiliare o){
        if(o == this) return 0;
        return this.getProprietario().val().compareTo(o.getProprietario().val());
    }

}
