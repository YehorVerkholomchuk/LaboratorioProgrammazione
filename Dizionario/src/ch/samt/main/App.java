package ch.samt.main;

import ch.samt.dictionary.Dictionary;
import ch.samt.dictionary.Entry;

public class App {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary();

        d1.aggiungi(new Entry("cane", "dog"));
        d1.aggiungi(new Entry("gatto", "cat"));
        d1.aggiungi(new Entry("tavolo", "table"));

        System.out.println(d1.cerca("gatto"));
        d1.rimuovi("tavolo");
        d1.stampaTutto();
    }
}