package exercicio6;
/*
Roberto está desenvolvendo um sistema de relatórios financeiros e precisa formatar valores monetários com duas
 casas decimais. Construa um programa que receba um valor monetário e exiba o valor formatado com duas casas decimais.

Exemplo de Entrada:

Digite o valor: 19,9876

Saída esperada:

Valor formatado: R$ 19,99

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = scan.nextDouble();

        String valorFormatado = String.format("%.2f",valor);
        System.out.println("Valor formatado: R$" + valorFormatado.replace(".", ","));
        scan.close();
    }
}
