package Exercicio9;

//Imagine que você está desenvolvendo um sistema de controle de devoluções para uma livraria.
// Quando um livro é devolvido com atraso, é necessário calcular o valor da multa conforme os dias de atraso.
//
//Crie um programa que:
//
//Defina uma classe com os atributos título e dias de atraso.
//Implemente um metodo que:
//Cobre R$ 2,50 por dia de atraso.
//Retorne o valor total da multa.
//Implemente um metodo que mostre o título e o valor da multa formatado.
//Exemplo de entrada:
//
//
//Copiar
//pedido.titulo = "Dom Casmurro";
//pedido.diasAtraso = 3;
//
//pedido.exibirDetalhes();
//
//Saída esperada:
//
//
//Copiar
//Livro: Dom Casmurro | Multa por 3 dias de atraso: R$ 7,50

public class Main {
    public static void main(String[] args) {

        Livro pedido = new Livro("Dom Casmurro", 3);
        pedido.exibirDetalhes();

    }
}
