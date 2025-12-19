package ch.samt.clashroyale.model;

import java.util.Objects;

/**
 * Superclasse: incapsulamento + information hiding.
 * equals/hashCode basati su name (identità logica della carta).
 */
public class Card {
    private String name;
    private int elixirCost;
    private int level;

    public Card(String name, int elixirCost, int level) {
        this.name = name;
        this.elixirCost = elixirCost;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getElixirCost() {
        return elixirCost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Metodo "di base" per mostrare binding dinamico:
     * lo override nelle sottoclassi cambierà il risultato chiamandolo via Card.
     */
    @Override
    public String toString() {
        return "Card{name='" + name + "', elixirCost=" + elixirCost + ", level=" + level + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
