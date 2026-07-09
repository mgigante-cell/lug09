package secondo_esercizio;

public class Test {
    public static void main(String[] args) {
        
        Correntista c1 = new Correntista("Mario Rossi");
        Correntista c2 = new Correntista("Luigi Verdi");

        System.out.println("MOVIMENTI BANCARI IN CORSO\n");

        c1.getConto().versamento(1000.0);
        c1.getConto().prelievo(250.0);
        c1.getConto().calcolaInteressi(2.0); 

        c2.getConto().versamento(500.0);
        c2.getConto().calcolaInteressi(1.5);
        c2.getConto().versamento(300.0);
        c2.getConto().prelievo(100.0);

        System.out.println("ESTRATTO CONTO: " + c1);
        c1.getConto().stampaEstrattoConto();

        System.out.println("ESTRATTO CONTO: " + c2);
        c2.getConto().stampaEstrattoConto();
    }
}