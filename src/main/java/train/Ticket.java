package train;
import java.util.Scanner;

public class Ticket {
    private int eta;
    private int kmDaPercorrere;

    public Ticket(int eta, int kmDaPercorrere) throws IllegalArgumentException{
        if (eta <= 0 || kmDaPercorrere <= 0) {
            throw new IllegalArgumentException("L'età e la distanza devono essere numeri positivi.");
        }
        this.eta = eta;
        this.kmDaPercorrere = kmDaPercorrere;
    }

    public double calcolaPrezzo() {
        double prezzoAlKm = 0.21;
        double prezzo = prezzoAlKm * kmDaPercorrere;

        if (eta <= 20) {
            double prezzoScontato = prezzo - (prezzo * 20 / 100);
            return prezzoScontato;
        } else if (eta >= 65 ) {
            double prezzoScontato = prezzo- (prezzo * 40 / 100);
            return prezzoScontato;
        } else {
            return prezzo;
        }
    }
}