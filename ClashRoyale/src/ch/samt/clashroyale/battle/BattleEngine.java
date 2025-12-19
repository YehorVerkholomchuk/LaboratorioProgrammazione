package ch.samt.clashroyale.battle;

import ch.samt.clashroyale.model.Card;
import ch.samt.clashroyale.model.SpellCard;
import ch.samt.clashroyale.model.TroopCard;

public class BattleEngine {

    /**
     * Polimorfismo: parametro Card, ma comportamento differenziato con instanceof + downcasting.
     */
    public void playCard(Card card) {
        System.out.println("Giocata carta: " + card); // binding dinamico su toString()

        if (card instanceof TroopCard) {
            TroopCard troop = (TroopCard) card; // downcasting
            System.out.println(" -> Truppa: HP=" + troop.getHitPoints() + ", DMG=" + troop.getDamage());
        } else if (card instanceof SpellCard) {
            SpellCard spell = (SpellCard) card; // downcasting
            System.out.println(" -> Incantesimo: AreaDMG=" + spell.getAreaDamage() + ", Radius=" + spell.getRadius());
        } else {
            System.out.println(" -> Tipo carta sconosciuto (solo Card base).");
        }
    }

    /**
     * Esempio di binding statico: metodo statico.
     */
    public static String rules() {
        return "Regole: ogni carta costa elisir; truppe hanno HP/DMG; incantesimi hanno area damage e raggio.";
    }
}
