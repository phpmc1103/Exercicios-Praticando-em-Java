import java.util.Scanner;

public class Exercicio6 {
    //Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta,
    // sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que,
    // ao receber um dia da semana, informe se é um dia útil ou não.
    //
    //Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem indicando se é um dia útil ou não.
    //
    //Exemplo de Entrada:
    //
    //Digite o dia da semana (em letras minúsculas): quarta
    //
    //Saída esperada:
    //
    //Quarta é um dia útil.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaDaSemana = scan.nextLine();

        if (diaDaSemana.equals("segunda")) {
            System.out.println("Segunda é um dia útil.");
        } else if (diaDaSemana.equals("terça")) {
            System.out.println("Terça é um dia útil.");
        } else if (diaDaSemana.equals("quarta")) {
            System.out.println("Quarta é um dia útil.");
        } else if (diaDaSemana.equals("quinta")) {
            System.out.println("Quinta é um dia útil.");
        } else if (diaDaSemana.equals("sexta")) {
            System.out.println("Sexta é um dia útil.");
        } else{
            System.out.println("É fim de semana.");
        }
    }
}