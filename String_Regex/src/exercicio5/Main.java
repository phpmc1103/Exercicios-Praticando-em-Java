package exercicio5;
/*
Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto.
 Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no texto.

Exemplo de entrada:

Digite o texto: O gato caça o rato.
Digite a palavra: gato

Saída esperada:

A palavra "gato" está presente no texto.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();
        System.out.print("Digite a palavra: ");
        String palavra = scan.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra \"%s\" está presente no texto.%n", palavra);

        } else {
            System.out.printf("A palavra \"%s\" não está presente no texto.%n", palavra);

        }
        scan.close();
    }
}
