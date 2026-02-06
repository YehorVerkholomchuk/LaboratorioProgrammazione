import java.util.ArrayList;

public class SmartLibrary {
    private ArrayList<LibraryResource> resLista;

    public SmartLibrary() {
        this.resLista = new ArrayList<>();
    }

    public void addResource(LibraryResource res) {
        if (res != null) {
            this.resLista.add(res);
        }
    }

    public void removeResource(LibraryResource res) {
        if (res != null) {
            this.resLista.remove(res);
        }
    }

    public int getResourceCount() {
        return this.resLista.size();
    }

    public ArrayList<LibraryResource> getDownloadableResources() {
        ArrayList<LibraryResource> dResources = new ArrayList<>();
        for (LibraryResource res: this.resLista) {
            if (res instanceof Downloadable) {
                dResources.add(res);
            }
        }
        return dResources;
    }
}