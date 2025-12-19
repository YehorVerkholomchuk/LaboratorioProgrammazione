package ch.samt.clashroyale.model;

/**
 * AGGREGAZIONE: Player "usa" un Deck (che può essere creato altrove e assegnato).
 */
public class Player {
    private String nickname;
    private Deck deck;

    public Player(String nickname, Deck deck) {
        this.nickname = nickname;
        this.deck = deck;
    }

    public String getNickname() {
        return nickname;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Player{nickname='" + nickname + "', deck=" + deck + "}";
    }
}
