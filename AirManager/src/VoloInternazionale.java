import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class VoloInternazionale extends Prenotazione implements Documentabile {
    private String destinazione;
    private String nomePasseggero;
    private boolean bagaglioStiva;

    public VoloInternazionale(String codiceVolo, LocalDate dataPartenza, double prezzoBase, String destinazione, String nomePasseggero, boolean bagaglioStiva) {
        super(codiceVolo, dataPartenza, prezzoBase);
        this.destinazione = destinazione;
        this.nomePasseggero = nomePasseggero;
        this.bagaglioStiva = bagaglioStiva;
    }

    @Override
    public double calcolaCostoTotale() {
        if (bagaglioStiva) {
            return getPrezzoBase() + 65;
        }
        return getPrezzoBase() + 25;
    }

    @Override
    public String generaTicket() {
        String answerBagaglio = "NO";
        StringBuilder sb = new StringBuilder();
        /*
            pattern where EEEE is day of week,
            Locale.ITALIAN locates the date format
            %s - what you put in the string after ','
            %,.2f:
                % - format specifier for a number (%s for string)
                , - separate thousands (1,200 CHF)
                .2 - 2 digits after . (1,200.00 CHF)
                f - float
        */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALIAN);

        sb.append("**************************************************\n");
        sb.append("* BOARDING PASS                                  *\n");
        sb.append("**************************************************\n");
        sb.append(String.format(" PASSEGGERO:   %s\n", nomePasseggero.toUpperCase()));
        sb.append(String.format(" VOLO:         %s\n", getCodiceVolo().toUpperCase()));
        sb.append(String.format(" DESTINAZIONE: %s\n", destinazione.toUpperCase()));
        sb.append(String.format(" DATA:         %s\n", getDataPartenza().format(formatter)));
        sb.append("--------------------------------------------------\n");

        if (!destinazione.equals("Tokyo")) {
            sb.append(" [INFO: Necessario Passaporto]\n");
            sb.append("--------------------------------------------------\n");
        }

        if (bagaglioStiva) {
            answerBagaglio = "YES";
        }
        sb.append(String.format(" BAGAGLIO IN STIVA: %s\n", answerBagaglio));
        sb.append(String.format(" PREZZO FINALE:     € %,.2f\n", calcolaCostoTotale()));
        sb.append("**************************************************");

        return sb.toString();
    }
}
