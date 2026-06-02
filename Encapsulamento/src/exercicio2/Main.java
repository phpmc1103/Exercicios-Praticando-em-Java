package exercicio2;
//Você está desenvolvendo um aplicativo de agenda para uma empresa.
// Os funcionários precisam acessar rapidamente os contatos de clientes e fornecedores,
// mantendo as informações organizadas e fáceis de localizar.
//
//Crie uma classe que:
//
//Armazene contatos com nome e telefone em uma lista
//Permita visualizar todos os contatos cadastrados
//Formate a exibição para melhor legibilidade
//Exemplo de entrada:
//
//contatos.add(new Contato("João Silva", "(11) 99999-0000"));
//contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
//contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
//
//Saída esperada:
//
//1. João Silva - (11) 99999-0000
//2. Luana Santos - (21) 98888-0000
//3. Pedro Oliveira - (31) 97777-0000

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> contatos = new ArrayList<>();
        contatos.add(new Cliente("João Silva", "(11) 99999-0000"));
        contatos.add(new Cliente("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Cliente("Pedro Oliveira", "(31) 97777-0000"));

        int numero = 1;
        System.out.println("Lista de contatos: ");
        for(Cliente e : contatos){
            System.out.printf("%d. %s - %s%n",numero, e.getNome(), e.getTelefone());
            numero++;
        }



    }
}
