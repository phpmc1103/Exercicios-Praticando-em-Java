import java.util.Scanner;

public class Exercicio7 {
    //Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro
    // da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
    //
    //Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
    //
    //Exemplo de entrada:
    //
    //Digite o valor do empréstimo: 750
    //
    //Saída esperada:
    //
    //O valor 750, não está dentro do intervalo permitido para empréstimo.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo: ");
        int emprestimo = scan.nextInt();

        if(emprestimo >= 1000 && emprestimo<= 5000){
            System.out.println("O valor "+emprestimo+ " está dentro do intervalo permitido para empréstimo.");
        }else {
            System.out.println("O valor "+emprestimo+ ", não está dentro do intervalo permitido para empréstimo.");
        }

    }
}
