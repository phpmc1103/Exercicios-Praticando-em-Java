package exercicio3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if(preco >= 0){
            this.preco = preco;
        }else{
            this.preco = 0;
            System.out.println("Preço inválido.");
        }
    }
    public void exibir(){
        System.out.printf("Produto: %s%nPreço: %.2f%n",nome,preco);
    }
}
