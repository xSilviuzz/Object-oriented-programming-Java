public record CodiceCorso(int cod) {
   public CodiceCorso{
       if(cod < 0 || cod > 999){
           throw new IllegalArgumentException("Codice non valido");
       }
   }

   @Override
    public String toString(){
       return("Codice corso: "+cod);
   }
}
