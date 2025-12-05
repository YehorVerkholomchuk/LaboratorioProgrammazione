//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Nicola", 16, "123.456.789");
        Persona p2 = new Persona("Nicola", 16, "123.456.789");

        if (p1.equals(p2)) {
            System.out.println("Maruca");
        }
    }
}