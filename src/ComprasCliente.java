public class ComprasCliente {
    private String nome;

    private double valor;

    public ComprasCliente(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
