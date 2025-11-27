import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eta;
        String nome;
        String cognome;

        Scanner input = new Scanner(System.in); //Creato oggetto Scanner, il coso aspetta input
        try {
            System.out.print("Inserisci il tuo nome: ");
            nome = input.nextLine(); //Letto input e salvato in nome

            System.out.print("Inserisci il tuo cognome: ");
            cognome = input.nextLine();

            System.out.print("Inserisci età: ");
            //int eta = Integer.parseInt(input.nextLine());
            eta = input.nextInt();
            System.out.println(nome + " " + cognome + ", sei un coso che ha " + eta);
        } catch (InputMismatchException ime) {
            System.out.println("L'età è da inserire in formato numerico");
        }
    }
}