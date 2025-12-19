package ch.samt.clashroyale.app;

import ch.samt.clashroyale.battle.BattleEngine;
import ch.samt.clashroyale.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Binding statico: chiamata a metodo statico (risolto a compile-time)
        System.out.println(BattleEngine.rules());
        System.out.println();

        // Creo carte (costruttori + this usato internamente)
        TroopCard knight = new TroopCard("Knight", 3, 11, 1500, 160);
        TroopCard musketeer = new TroopCard("Musketeer", 4, 11, 900, 220);
        SpellCard fireball = new SpellCard("Fireball", 4, 11, 325, 2.5);

        // Creo un deck (composizione: deck crea e possiede ArrayList)
        Deck deck = new Deck();
        deck.addCard(knight);
        deck.addCard(musketeer);
        deck.addCard(fireball);

        // Provo duplicato logico (stesso name -> equals true -> non entra)
        TroopCard knightClone = new TroopCard("Knight", 3, 1, 1, 1);
        deck.addCard(knightClone);

        // Creo player (aggregazione: player usa un deck)
        Player player = new Player("ProPlayer320", deck);

        System.out.println("=== PLAYER ===");
        System.out.println(player);
        System.out.println();

        System.out.println("=== CARTE NEL DECK (ArrayList via List unmodifiable) ===");
        for (Card c : player.getDeck().getCards()) {
            // Binding dinamico: toString chiamato su Card ma esegue override reale
            System.out.println(c);
        }
        System.out.println();

        // ArrayList "di gioco" separata (per mostrare uso esplicito di ArrayList)
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(knight);
        hand.add(fireball);
        hand.add(musketeer);

        System.out.println("=== SIMULAZIONE: GIOCO CARTE ===");
        BattleEngine engine = new BattleEngine();

        for (Card c : hand) {
            // Polimorfismo: parametro Card
            engine.playCard(c);
            System.out.println();
        }

        // Dimostrazione equals
        System.out.println("=== TEST equals() ===");
        System.out.println("knight.equals(knightClone)? " + knight.equals(knightClone));
        System.out.println("deck contiene knightClone? " + player.getDeck().getCards().contains(knightClone));
    }
}
