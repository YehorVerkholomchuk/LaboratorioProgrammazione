public class Main {
    public static void main(String[] args) {
        try {
            for (String arg : args) {
                float numero = Float.parseFloat(arg);
                verificaSegno(numero);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Inserire solo numeri");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void verificaSegno(float numeroTest) {
        if (numeroTest < 0) {
            System.out.println("Il numero " + numeroTest + " è negativo");
        } else if (numeroTest > 0) {
            System.out.println("Il numero " + numeroTest + " è positivo");
        } else {
            throw new IllegalArgumentException("Il numero non può essere zero");
        }
    }
}