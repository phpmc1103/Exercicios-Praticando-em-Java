import java.util.Scanner;

public class Exercicio4 {
    //Pedro quer calcular o fatorial de um número.
    // O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número.
    // Por exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que receba um número e calcule seu fatorial.
    //
    //Exemplo de entrada:
    //
    //Digite um número: 5
    //
    //Saída esperada:
    //
    //O fatorial de 5 é: 120
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        int total = 1;

        for (int i = numero; i > 0; i--) {
            total *= i;

        }
        System.out.printf("O fatorial de %d é: %d",numero,total);
    }
}
