import java.util.Scanner;

public class Exercicio4 {
    //Pedro está aprendendo Java e se deparou com um problema: ele precisa
    // criar um programa que compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
    // Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
    //
    //Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
    // compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
    //
    //Exemplo de entrada:
    //
    //Digite o primeiro número: 10
    //Digite o segundo número: 25
    //
    //Saída esperada:
    //
    //O maior número é 25.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if(numero1 > numero2){
            System.out.println("O maior número é: "+numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: "+numero2);
        }else {
            System.out.println("Os número são iguais.");
        }
    }
}
