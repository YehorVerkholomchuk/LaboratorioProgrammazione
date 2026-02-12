import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartLibrary sl = new SmartLibrary();
        EBook lr1 = new EBook("Maruca", 100);
        EBook lr2 = new EBook("Grosa", 80);
        PhysicalBook pb1 = new PhysicalBook("Fabio", 20, "Boh");
        sl.addResource(lr1);
        sl.addResource(pb1);
        sl.addResource(lr2);
        sl.getDownloadableResources();
    }
}