package exercicio1;
//Imagine que você é responsável pelo controle de estoque de uma loja de
// informática que está expandindo seus negócios. Com o aumento da demanda,
// é importante manter um registro organizado e preciso de todos os produtos disponíveis.
// Sua tarefa é criar um sistema que armazene as informações de cada item e gere um relatório
// para facilitar a gestão do estoque.
//
//Sua tarefa é criar uma classe que:
//
//Represente um produto com os atributos nome, preço e quantidade.
//Implemente um metodo que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
//Exemplo de entrada:
//
//nome = "Mouse Gamer"
//preco = 159.9
//quantidade = 25
//Copiar código
//Saída esperada:
//
//Produto: Mouse Gamer
//Preço: R$ 159,90
//Quantidade em estoque: 25
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.name = "Mouse Gamer";
        produto1.price = 159.9;
        produto1.quantity = 25;

        produto1.displayInfo();
    }
}
