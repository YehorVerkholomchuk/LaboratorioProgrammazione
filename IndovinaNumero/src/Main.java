/*
 * Esercizio Indovina il Numero
 * @author Yehor Verkholomchuk I2BD
 * @version 17.10.2025
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        int num;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(1, 100);
        System.out.print("Indovina il numero tra 1 e 100: ");

        while (true) {
            try {
                num = input.nextInt();
                System.out.println("Il tuo tentativo: " + num);

                if (num < 0 || num > 100) {
                    System.out.println("Inserire un numero tra 1 e 100");
                } else if (num > rndNumber) {
                    System.out.println("Troppo alto!");
                    attempts++;
                } else if (num < rndNumber) {
                    System.out.println("Troppo basso!");
                    attempts++;
                } else {
                    System.out.println("Bravo! Hai indovinato in " + attempts + " tentativi");
                    return;
                }
            } catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Inserire un numero intero");
            }
        }
    }
}