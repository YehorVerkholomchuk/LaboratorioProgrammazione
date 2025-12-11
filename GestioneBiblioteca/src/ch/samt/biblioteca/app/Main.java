package ch.samt.biblioteca.app;

import ch.samt.biblioteca.data.Biblioteca;
import ch.samt.biblioteca.model.Dvd;
import ch.samt.biblioteca.model.ItemBiblioteca;
import ch.samt.biblioteca.model.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        ItemBiblioteca i1 = new Libro("abc123", "Libro1", 2000, "a", "Bob", 200);
        ItemBiblioteca i2 = new Libro("ghi789", "Libro2", 1950, "b", "William", 400);
        ItemBiblioteca i3 = new Dvd("def456", "Dvd1", 2020, "c", "Fabio", 100);

        b1.aggiungiItem(i1);
        b1.aggiungiItem(i2);
        b1.aggiungiItem(i3);

        b1.stampaCatalogo();
        System.out.println(b1.getElementiDiAutore("Fabio"));

        b1.aggiungiPrenotazioneFIFO(i1);
        b1.aggiungiPrenotazioneFIFO(i2);
        b1.aggiungiPrenotazioneFIFO(i3);
        System.out.println(b1.prossimaPrenotazioneFIFO());
    }
}