package exercicio2;
/*
Você está trabalhando no sistema de gestão de uma escola, garantindo que a lista de estudantes esteja sempre correta.
Durante uma revisão nos cadastros, percebeu que um nome foi adicionado incorretamente: “Pedro”.
Para evitar confusões na emissão de certificados e registros, você precisa corrigir essa informação imediatamente.

Sua tarefa é remover o nome “Pedro” da lista. Considere que a lista inicial possui os seguintes nomes:
Joana, Lucas, Pedro e Antônio.

Saída esperada:

Lista inicial: [Joana, Lucas, Pedro, Antônio]
Lista após a exclusão: [Joana, Lucas, Antônio]

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Joana");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Antônio");

        System.out.println("Lista inicial: " + lista);
        lista.remove("Pedro");
        System.out.println("Lista após a exclusão: " + lista);

    }
}
