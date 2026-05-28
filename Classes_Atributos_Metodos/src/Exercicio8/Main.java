package Exercicio8;
//Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e precisa garantir que o estoque
// seja atualizado corretamente a cada venda realizada. Seu programa deve processar as vendas e alertar quando
// não houver produtos suficientes no estoque.
//
//Crie um programa que:
//
//Defina uma classe com os atributos nome e quantidade.
//Implemente um metodo que:
//Subtraia a quantidade vendida do estoque se houver disponibilidade.
//Exiba uma mensagem formatada com o saldo atual usando printf
//Exiba um alerta “Estoque insuficiente” quando não for possível atender a venda.
//Exemplo de entrada:
//
//
//Copiar
//item.nome = "Camiseta";
//item.quantidade = 10;
//
//item.vender(3);
//item.vender(8);
//
//Saída esperada:
//
//
//Copiar
//Venda realizada. Estoque restante de Camiseta: 7
//Estoque insuficiente

public class Main {

    public static void main(String[] args) {
        Estoque produto1 = new Estoque();

        produto1.nome = "Celular";
        produto1.quantidade = 8;
        produto1.vender(4);
        produto1.vender(4);
        produto1.vender(1);
        System.out.println(produto1.quantidade);
    }
}
