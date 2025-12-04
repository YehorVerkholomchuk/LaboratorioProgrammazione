//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Room r1 = new Room("Cucina", 15.5);
            Room r2 = new Room("Bagno", 8);
            Room r3 = new Room("Sala", 19.43);

            House h1 = new House();
            h1.aggiungiStanza("Cucina", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRORE: Dato invalido");
        }
    }
}