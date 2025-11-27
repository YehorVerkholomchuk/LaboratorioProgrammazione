import java.util.ArrayList;

public class Carrello {
    private String nome;
    private ArrayList<Alimento> alimenti;

    public Carrello(String nome) {
        this.nome = nome;
        alimenti = new ArrayList<>();
    }

    public void aggiungiAlimento(Alimento alimento) {
        alimenti.add(alimento);
    }

    public void aggiungiAlimento(String nome, String categoria, String dataScadenza, int qt) {
        alimenti.add(new Alimento(nome,categoria,dataScadenza,qt));
    }

    public void rimuoviAlimento(Alimento alimento) {
        alimenti.remove(alimento);
    }
}
