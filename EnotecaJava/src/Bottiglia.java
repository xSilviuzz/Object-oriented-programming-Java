public interface Bottiglia extends Comparable<Bottiglia>{

    Etichetta getNomeCommerciale();
    Anno annoVendemmia();
    Anno annoImbottigliamento();
    Produttore getProduttore();
    Categoria getCategoria();

    default int compareTo(Bottiglia o){
        if(o == null) return 1;
        if(this == o) return 0;
        int c = this.getProduttore().val.compareToIgnoreCase(o.getProduttore().val);
        if(c != 0) return c;
        return this.getNomeCommerciale().val.compareToIgnoreCase(o.getNomeCommerciale().val);
    }

}
