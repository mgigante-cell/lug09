package secondo_esercizio;

import java.util.ArrayList;
import java.util.List;

public class ContoBancario {
    private double saldo = 0.0;
    private List<String> storicoOperazioni = new ArrayList<>();

    public void versamento(double importo) {
        if (importo <= 0)
            throw new IllegalArgumentException("Errore: l'importo non può essere negativo");

        this.saldo += importo;
        storicoOperazioni.add("Versamento: " + importo + " euro\nSaldo aggiornato: " + this.saldo + " euro");
    }

    public void prelievo(double importo) {
        if (importo <= 0)
            throw new IllegalArgumentException("Errore: l'importo non può essere negativo");
        if (this.saldo < importo)
            throw new IllegalArgumentException("Errore: l'importo supera il saldo disponibile");

        saldo -= importo;
        storicoOperazioni.add("Prelievo: " + importo + " euro\nSaldo aggiornato: " + this.saldo + " euro");
    }

    public void calcolaInteressi(double tassoPercentuale) {
        if (tassoPercentuale <= 0)
            throw new IllegalArgumentException("Errore: il tasso deve essere positivo");

        double interessi = (this.saldo * tassoPercentuale) / 100;
        this.saldo += interessi;
        storicoOperazioni.add("Saldo con interesse del " + tassoPercentuale + "% applicato: " + this.saldo + " euro");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Saldo iniziale: 0.0 euro\n"); //sarà sempre 0 perchè non gli ho dato la possibilità di partire con un valore dal costruttore

        for (String operazione : storicoOperazioni) 
            sb.append(operazione).append("\n");

        return sb.toString();
    }
}