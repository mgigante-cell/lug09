package secondo_esercizio;

import java.util.ArrayList;
import java.util.List;

public class ContoBancario {
    private double saldo = 0.0;
    private List<String> storicoOperazioni = new ArrayList<>();;

    public void versamento(double importo) {
        if (importo <= 0)
            throw new IllegalArgumentException("Errore: l'importo non può essere negativo");

        this.saldo += importo;
        storicoOperazioni.add("Versamento: +" + importo + " €");
    }

    public void prelievo(double importo) {
        if (importo <= 0)
            throw new IllegalArgumentException("Errore: l'importo non può essere negativo");
        if (this.saldo < importo)
            throw new IllegalArgumentException("Errore: l'importo supera il saldo disponibile");

        saldo -= importo;
        storicoOperazioni.add("Prelievo: -" + importo + " €");
    }

    public void calcolaInteressi(double tassoPercentuale) {
        if (tassoPercentuale <= 0)
            throw new IllegalArgumentException("Errore: il tasso deve essere positivo");

        double interessi = (this.saldo * tassoPercentuale) / 100;
        this.saldo += interessi;
        storicoOperazioni.add("Interessi maturati (" + tassoPercentuale + "%): +" + interessi + " €");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDettagli Conto Bancario\n");
        sb.append("Saldo: ").append(saldo).append(" €\n");
        sb.append("Storico Operazioni:");

        if (storicoOperazioni.isEmpty())
            sb.append(" Nessuna operazione registrata.\n");
        else {
            sb.append("\n");
            for (String operazione : storicoOperazioni)
                sb.append("  - ").append(operazione).append("\n");
        }
        return sb.toString();
    }
}
