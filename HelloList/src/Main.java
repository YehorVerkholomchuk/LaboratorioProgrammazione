//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carrello c1 = new Carrello("Spesa");
        Alimento pasta = new Alimento("Coso", "Pasta", "21.10.2008", 4);
        c1.aggiungiAlimento(pasta);
    }
}