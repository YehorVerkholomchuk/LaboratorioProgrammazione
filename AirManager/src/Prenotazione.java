import java.time.LocalDate;

public abstract class Prenotazione implements Documentabile {
    private String codiceVolo;
    private LocalDate dataPartenza;
    private double prezzoBase;

    public Prenotazione(String codiceVolo, LocalDate dataPartenza, double prezzoBase) {
        /*
            ^ - start of the regex string
            [A-Z] - 1 uppercase letter from A to Z
            {2} - only 2 of these letters
            \\d - 1 digit (0-9)
            {3} - only 3 of these digits
            $ - end of the regex string
        */

        if (!codiceVolo.matches("^[A-Z]{2}\\d{3}$")) {
            throw new IllegalArgumentException("Codice volo non valido");
        }
        if (dataPartenza.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Data non valida");
        }
        if (prezzoBase <= 0) {
            throw new IllegalArgumentException("Prezzo base non valido");
        }

        this.codiceVolo = codiceVolo;
        this.dataPartenza = dataPartenza;
        this.prezzoBase = prezzoBase;
    }

    public String getCodiceVolo() {
        return codiceVolo;
    }

    public void setCodiceVolo(String codiceVolo) {
        this.codiceVolo = codiceVolo;
    }

    public LocalDate getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDate dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    @Override
    public String generaTicket() {
        return "coso ticket";
    }

    public abstract double calcolaCostoTotale();
}
