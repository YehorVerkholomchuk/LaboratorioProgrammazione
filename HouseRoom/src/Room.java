public class Room {
    private String nome;
    private double superficieMq;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSuperficieMq() {
        return superficieMq;
    }

    public void setSuperficieMq(double superficieMq) {
        this.superficieMq = superficieMq;
    }

    public Room(String nome, double superficieMq) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        if (superficieMq <= 0) {
            throw new NumberFormatException("a");
        }
        this.nome = nome;
        this.superficieMq = superficieMq;
    }

    public String toString() {
        return nome + " (" + superficieMq + ")";
    }
}
