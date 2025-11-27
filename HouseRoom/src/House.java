import java.util.ArrayList;

public class House {
    private ArrayList<Room> stanze;

    public House() {
        stanze = new ArrayList<>();
    }

    public void aggiungiStanza(String nome, double superficieMq) {
        stanze.add(new Room(nome,superficieMq));
    }

    public void visualizzaStanze() {
        if (!stanze.isEmpty()) {
            System.out.println("ELENCO STANZE:");
            for (Room room : stanze) {
                System.out.println(room);
            }
        } else {
            System.out.println("La casa è vuota.");
        }
    }
}
