package ch.samt.clashroyale.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * COMPOSIZIONE: Deck possiede la lista di carte (la crea e la gestisce).
 */
public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        // Qui si vede anche equals(): non aggiungo duplicati logici (stesso name)
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    /**
     * Ritorno una vista non modificabile: information hiding.
     * (evita che dall'esterno facciano deck.getCards().clear()).
     */
    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    @Override
    public String toString() {
        return "Deck{cards=" + cards + "}";
    }
}
