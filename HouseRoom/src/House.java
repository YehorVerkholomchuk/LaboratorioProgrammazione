import java.util.ArrayList;

public class House {
    private ArrayList<Room> stanze;

    public House() {
        stanze = new ArrayList<>();
    }

    public void aggiungiStanza(String nome, double superficieMq) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        if (superficieMq <= 0) {
            throw new IllegalArgumentException("Valore di mq invalido");
        }
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

    public double getSuperficieTotale() {
        double superficieTot = 0;
        if (!stanze.isEmpty()) {
            for (Room room : stanze) {
                superficieTot += room.getSuperficieMq();
            }
        }
        return superficieTot;
    }

    public Room trovaStanza(String nome) {
        if (!stanze.isEmpty()) {
            for (Room room : stanze) {
                if (room.getNome().equals(nome)) {
                    return room;
                }
            }
        }
        return null;
    }

    public void rimuoviStanza(String nome) {
        if (trovaStanza(nome) != null) {
            stanze.remove(trovaStanza(nome));
        } else {
            System.out.println("Stanza non trovata");
        }
    }
}
