//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Matrice m1 = new Matrice(6, 7);
        Matrice m2 = new Matrice();

        m1.popolaMatrice();
        m1.stampaMatrice();
        m1.getCella(0, 1);
    }
}