package secondo_esercizio;

public class Correntista {
    private static int idProgressivo = 0;
    
    private final int ID;
    private String nome;
    private String cognome;
    private ContoBancario conto = new ContoBancario();
    

    public Correntista(String nome, String cognome){
        this.ID = ++idProgressivo;
        this.nome = nome;
        this.cognome = cognome;
    }

    public ContoBancario getConto() { return conto; }

    @Override
    public String toString() {
        return "Correntista : ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + "\n" + conto;
    }
}