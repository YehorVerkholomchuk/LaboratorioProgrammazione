public class Alimento {
    private String nome;
    private String dataScadenza;
    private String categoria;
    private int qt;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public Alimento(String nome, String categoria, String dataScadenza, int qt) {
        this.nome = nome;
        this.dataScadenza = dataScadenza;
        this.categoria = categoria;
        this.qt = qt;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", dataScadenza='" + dataScadenza + '\'' +
                ", categoria='" + categoria + '\'' +
                ", qt=" + qt +
                '}';
    }
}
