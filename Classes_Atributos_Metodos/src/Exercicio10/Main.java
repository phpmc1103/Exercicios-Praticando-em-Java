package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Você está desenvolvendo o sistema de checkout de um e-commerce de produtos eletrônicos.
    // Seu desafio é calcular o valor total do carrinho de compras, considerando que cada produto
    // pode ter quantidades diferentes e preços variados.
    //
    //Crie um programa que:
    //
    //Defina uma classe com os atributos nome, preço e quantidade.
    //Implemente um metodo que retorne o valor total do item (preço x quantidade).
    //Crie uma lista de item e calcule o valor total da compra.
    //Exemplo de entrada:
    //
    //
    //Copiar
    //i1.nome = "Teclado";
    //i1.preco = 120.0;
    //i1.quantidade = 1;
    //
    //i2.nome = "Mouse";
    //i2.preco = 60.0;
    //i2.quantidade = 2;
    //
    //Saída esperada:
    //
    //
    //Copiar
    //Total da compra: R$ 240.00
    public static void main(String[] args) {

        CarrinhoDeCompras i1 = new CarrinhoDeCompras("Teclado", 120,1);
        CarrinhoDeCompras i2 = new CarrinhoDeCompras("Mouse", 60,2);

        List<CarrinhoDeCompras> lista = new ArrayList<>();
        lista.add(i1);
        lista.add(i2);

        double total = 0;
        for(CarrinhoDeCompras item : lista){
            total += item.valorTotal();
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);

    }
}
