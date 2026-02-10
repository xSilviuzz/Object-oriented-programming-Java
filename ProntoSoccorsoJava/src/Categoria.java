import java.util.Objects;

public enum Categoria {
        RIANIMAZIONE {
            @Override
            public boolean compatibileCon(Priorita p) {
                return p == Priorita.ROSSO;
            }
        },
        CARDIOLOGIA {
            @Override
            public boolean compatibileCon(Priorita p) {
                return p == Priorita.ROSSO || p == Priorita.GIALLO;
            }
        },
        ORTOPEDIA {
            @Override
            public boolean compatibileCon(Priorita p) {
                return p == Priorita.GIALLO || p == Priorita.VERDE;
            }
        },
        DERMATOLOGIA {
            @Override
            public boolean compatibileCon(Priorita p) {
                return p == Priorita.BIANCO || p == Priorita.VERDE;
            }
        };

        public abstract boolean compatibileCon(Priorita p);

        public boolean compatibileConNonNull(Priorita p) {
            Objects.requireNonNull(p, "priorita");
            return compatibileCon(p);
        }
    }

