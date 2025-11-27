import java.util.Random;

public class Matrice {
    private int righe;
    private int colonne;
    private int[][] matrice;

    public int getRighe() {
        return righe;
    }

    public void setRighe(int righe) {
        this.righe = righe;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public Matrice(int righe, int colonne) {
        if (righe < 1 || colonne < 1) {
            throw new IllegalArgumentException("Numero non valido");
        }
        this.righe = righe;
        this.colonne = colonne;
        this.matrice = new int[righe][colonne];
    }

    public Matrice() {
        this.righe = 3;
        this.colonne = 3;
        this.matrice = new int[righe][colonne];
    }

    public void stampa() {
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print(" " + matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void popola() {
        Random rnd = new Random();
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrice[i][j] = rnd.nextInt(1,10);
            }
        }
    }

    public void sortRow() {
        int max = 0;
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                max = matrice[i][j];
                matrice[i][j] = matrice[i][i];
                matrice[i][i] = max;
            }
        }
    }
}
