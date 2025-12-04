package ch.samt.main;

import ch.samt.dictionary.Dictionary;
import ch.samt.dictionary.Entry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary();
        d1.aggiungi(new Entry("maruca", "maruck"));
        d1.stampaTutto();
    }
}