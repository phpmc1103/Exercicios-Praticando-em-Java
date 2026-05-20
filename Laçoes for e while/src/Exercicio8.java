import java.util.Scanner;

public class Exercicio8 {
    //Ana é professora de matemática e está sempre curiosa sobre as respostas de seus alunos. Hoje, ela propôs um exercício no qual os alunos devem contar quantos números positivos e negativos existem em uma sequência de números fornecida por ela.
    //
    //Ela quer que os alunos criem um programa que permita **inserir vários números, um por vez, e que pare quando o número "fim" for digitado. **
    //
    //Exemplo de entrada:
    //
    //Digite um número (ou 'fim' para encerrar): 3
    //Digite um número (ou 'fim' para encerrar): -1
    //Digite um número (ou 'fim' para encerrar): 7
    //Digite um número (ou 'fim' para encerrar): fim
    //
    //Saída esperada:
    //
    //Números positivos: 2
    //Números negativos: 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numerosP = 0, numerosN = 0;

        while(true){
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String resposta = scan.nextLine();
            if(resposta.equals("fim")){
                break;
            }
            int numero = Integer.parseInt(resposta);
            if(numero > 0){
                numerosP++;
            } else if (numero < 0) {
                numerosN++;
            }
        }

        System.out.println("Números positivos: " + numerosP);
        System.out.println("Números negativos: " + numerosN);

    }
}
