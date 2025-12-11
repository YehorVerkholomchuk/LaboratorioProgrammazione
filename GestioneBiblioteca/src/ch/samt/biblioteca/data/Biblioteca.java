package ch.samt.biblioteca.data;
import ch.samt.biblioteca.model.*;

import java.util.*;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> catalogo;
    private Set<String> codiciUsati;
    private Map<String, ArrayList<ItemBiblioteca>> elementiPerAutore;
    private Queue<ItemBiblioteca> prenotazioniFIFO;
    private Stack<ItemBiblioteca> consegneUrgentiLIFO;

    public Biblioteca() {
        catalogo = new ArrayList<>();
        codiciUsati = new HashSet<>();
        elementiPerAutore = new HashMap<>();
        prenotazioniFIFO = new PriorityQueue<>();
        consegneUrgentiLIFO = new Stack<>();
    }

    public boolean aggiungiItem(ItemBiblioteca item) {
        for (ItemBiblioteca i : catalogo) {
            if (item.equals(i)) {
                System.out.println("Dupplicato trovato");
                return false;
            }
        }

        catalogo.add(item);
        ArrayList<ItemBiblioteca> arrayList;

        if (item instanceof Libro) {
            Libro libro = (Libro) item;
            arrayList = getElementiDiAutore(libro.getAutore());
            if (!elementiPerAutore.containsKey(libro.getAutore())) {
                arrayList = new ArrayList<>();
            }

            arrayList.add(libro);
            elementiPerAutore.put(libro.getAutore(), arrayList);
        } else if (item instanceof Dvd) {
            Dvd dvd = (Dvd) item;
            arrayList = getElementiDiAutore(dvd.getRegista());
            if (!elementiPerAutore.containsKey(dvd.getRegista())) {
                arrayList = new ArrayList<>();
            }

            arrayList.add(dvd);
            elementiPerAutore.put(dvd.getRegista(), arrayList);
        }

        return true;
    }

    public ArrayList<ItemBiblioteca> getCatalogo() {
        return catalogo;
    }

    public ArrayList<ItemBiblioteca> getElementiDiAutore(String autore) {
        return elementiPerAutore.get(autore);
    }

    public boolean aggiungiPrenotazioneFIFO(ItemBiblioteca item) {
        return prenotazioniFIFO.add(item);
    }

    public ItemBiblioteca prossimaPrenotazioneFIFO() {
        return prenotazioniFIFO.peek();
    }

    public boolean aggiungiConsegnaUrgenteLIFO(ItemBiblioteca item) {
        return consegneUrgentiLIFO.add(item);
    }

    public ItemBiblioteca prossimaConsegnaLIFO() {
        return consegneUrgentiLIFO.getLast();
    }

    public void stampaCatalogo() {
        for (ItemBiblioteca i : catalogo) {
            System.out.println(i);
        }
    }
}
