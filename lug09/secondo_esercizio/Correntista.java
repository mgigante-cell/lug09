package secondo_esercizio;

public class Correntista {
    private static int idProgressivo = 0;
    
    private final int ID;
    private String nome;
    private ContoBancario conto;
    

    public Correntista(String nome){
        this.ID = ++idProgressivo;
        this.nome = nome;
        conto = new ContoBancario();
    }

    public int getID() { return ID; }
    public String getNome() { return nome; }
    public ContoBancario getConto() { return conto; }

    @Override
    public String toString() {
        return "Correntista : \nID=" + ID + ", nome=" + nome + conto;
    }
}
