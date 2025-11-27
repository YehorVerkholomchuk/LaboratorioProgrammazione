import java.util.Random;

public class Matrice {
    private int righe;
    private int colonne;
    private int[][] matrice;

    public Matrice(int righe, int colonne) {
        if (righe < 1 || colonne < 1) {
            throw new IllegalArgumentException("Almeno 1 riga e 1 colonna!");
        }
        this.righe = righe;
        this.colonne = colonne;
        matrice = new int[this.righe][this.colonne];
    }

    public Matrice() {
        this.righe = 5;
        this.colonne = 5;
        matrice = new int[this.righe][this.colonne];
    }

    public int getRighe() {
        return this.righe;
    }

    public int getColonne() {
        return this.colonne;
    }

    public int getCella(int righe, int colonne) {
        return matrice[righe][colonne];
    }

    public void setRighe(int righe) {
        this.righe = righe;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public void stampaMatrice() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]);
                if (j < colonne - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void popolaMatrice() {
        Random rnd = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = rnd.nextInt(0,2);
            }
        }
        System.out.println("Matrice è stata popolata con valori casuali da 0 a 1");
    }
}
