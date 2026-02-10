//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    CollezioneLibriArrayList a1 = new CollezioneLibriArrayList();

    CollezioneLibriLC lc1 = new CollezioneLibriLC();

    LibroSemplice l1 = new LibroSemplice("Bob","Io",200,2016);
    LibroSemplice l2 = new LibroSemplice("Ciao","Tu",120,1900);
    LibroSemplice l3 = new LibroSemplice("Spos","Egli",456,1901);


    lc1.aggiungiLibro(l1);
    lc1.aggiungiLibro(l2);
    lc1.aggiungiLibro(l3);
    System.out.println(lc1);


    System.out.println();
    System.out.println(lc1);


    System.out.println("\n\n");





}

/*
1) Interfaccia Libro
Ogni libro è caratterizzato da:

titolo (stringa non vuota, max 50 caratteri);

autore (stringa non vuota);

numero di pagine (intero > 0);

anno di pubblicazione (intero tra 1900 e l’anno corrente incluso).

Si definisca un’interfaccia Libro che esponga almeno i seguenti metodi:

String titolo()

String autore()

int pagine()

int annoPubblicazione()

Si modelli un tipo concreto LibroSemplice che implementi Libro e che verifichi i vincoli nel costruttore (se non rispettati, lancia un’eccezione).

2) Interfaccia CollezioneLibri (tipo 2)
Si introduca il concetto di CollezioneLibri, che rappresenta un insieme di libri e estende Iterable<Libro>.

Un oggetto di tipo CollezioneLibri espone i seguenti metodi:

void aggiungiLibro(Libro l)

boolean rimuoviLibro(Libro l)

Libro getLibro(int index)

int numeroLibri()

Inoltre espone metodi di analisi:

int pagineTotali() – somma delle pagine di tutti i libri;

double pagineMedie() – media delle pagine per libro (0 se la collezione è vuota);

int contaLibriAutore(String autore) – numero di libri di un certo autore.

Si definisca nella stessa interfaccia il seguente metodo di default:

default boolean collezioneCorposa()

che restituisce true se e solo se:

ci sono almeno 5 libri;

le pagine totali sono almeno 1000;

esiste almeno un libro pubblicato dopo il 2015.

Il metodo di default deve usare solo i metodi esposti da CollezioneLibri (e l’iterazione tramite iterator()).

3) Classe astratta e implementazione concreta (tipo 3)
Si fornisca una classe astratta CollezioneLibriAbstract che implementi l’interfaccia CollezioneLibri e contenga:

un contenitore protetto per i libri (ad esempio un campo protected con una Collection o List);

un costruttore che inizializza il contenitore;

implementazioni concrete (non astratte) dei metodi:

numeroLibri()

pagineTotali()

pagineMedie()

contaLibriAutore(String autore)

iterator() (usando il contenitore interno)

La responsabilità di CollezioneLibriAbstract è fornire tutta la logica comune basata sulla struttura dati interna, lasciando ai sottotipi la scelta precisa della collezione da usare e di come gestire aggiungiLibro, rimuoviLibro, getLibro.

Si fornisca infine una classe concreta CollezioneLibriArrayList che:

estende CollezioneLibriAbstract;

utilizza una ArrayList<Libro> come struttura dati interna;

implementa:

aggiungiLibro(Libro l)

boolean rimuoviLibro(Libro l)

Libro getLibro(int index)
 */
