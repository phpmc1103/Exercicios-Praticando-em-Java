package exercicio10;

public class CarrinhoDeCompras {
    private String nome;
    private double preco;
    private int quantidade;

    public CarrinhoDeCompras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return preco * quantidade;
    }
}
