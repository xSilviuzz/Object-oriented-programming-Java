import java.util.Objects;

public abstract class AccessoPSAbstract implements AccessoPS{



        private final Codice c;
        private final DataOra arrivo;
        private final DataOra dimissioni;
        private final Nominativo n;
        private final Categoria cat;
        private final Priorita p;

        protected AccessoPSAbstract(Codice c,DataOra arrivo,DataOra dimissioni,Nominativo n,Categoria cat,Priorita p){

            if(!cat.compatibileCon(p)) throw new IllegalArgumentException("dsdsd");

            this.c = c;
            this.arrivo = arrivo;
            this.dimissioni = dimissioni;
            this.n = n;
            this.cat = cat;
            this.p = p;

        }


        @Override
        public Codice getCodice(){
            return c;
        }
        @Override
        public DataOra getArrivo(){
            return arrivo;
        }
        @Override
        public DataOra getDimissione(){
            return dimissioni;
        }
        @Override
        public Nominativo getPaziente(){
            return  n;
        }
        @Override
        public Categoria getCategoria(){
            return cat;
        }
        @Override
        public Priorita getPriorita(){
            return p;
        }

        @Override
        public String toString(){
            return("\nCodice: "+c+"\nArrivo: "+arrivo+"\nDimissione: "+dimissioni+"\nPaziente: "+n+"\nCategoria: "+cat+"\nPriorita: "+p);
        }

        @Override
        public int hashCode(){
            return Objects.hash(c);
        }

        @Override
        public boolean equals(Object o){
            if(o==this) return true;
            if(o == null || o.getClass() != this.getClass()) return false;
            AccessoPSAbstract that = (AccessoPSAbstract) o;
            return Objects.equals(c,that.getCodice());
        }


}
