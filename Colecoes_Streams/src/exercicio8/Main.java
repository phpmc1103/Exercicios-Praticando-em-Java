package exercicio8;
/*
Você está desenvolvendo uma aplicação matemática que precisa calcular o quadrado de uma lista de números.
Essa funcionalidade será usada para gerar gráficos e análises estatísticas. Para resolver essa tarefa você deve:

Criar uma lista contendo os números fornecidos.
Calcular o quadrado de cada número utilizando o metodo map.
Criar uma nova lista contendo os resultados.
Exibir a lista de quadrados no console.
Exemplo de entrada:

List<Integer> numeros = List.of(2, 3, 5, 7, 11);

Saída esperada:

 Quadrados dos números: [4, 9, 25, 49, 121]
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> numerosQuadrados = numeros.stream()
                .map(f -> f * f)
                .toList();

        System.out.println("Quadrado dos números: " + numerosQuadrados);

    }
}
