//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float[][][] m;
        m = new float[3][3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int a = 0; a < m[i][j].length; a++) {
                    m[i][j][a] = 1;
                    System.out.print(m[i][j][a] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}