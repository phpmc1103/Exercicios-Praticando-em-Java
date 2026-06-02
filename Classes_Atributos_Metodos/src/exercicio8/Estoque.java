package exercicio8;

public class Estoque {
    String nome;
    int quantidade;

    public void vender(int vendido) {
        if (quantidade < vendido){
            System.out.printf("Estoque insuficiente.%n");
        } else {
           quantidade -= vendido;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n",nome,quantidade);
        }
    }
}
