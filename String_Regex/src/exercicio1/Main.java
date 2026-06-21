package exercicio1;

import java.util.Scanner;

/* Joana está desenvolvendo um sistema de cadastro de usuários e percebeu q
 * ue muitos nomes estão sendo cadastrados com espaços em branco no início ou no final.
 * Ela quer um programa que remova esses espaços automaticamente.

 Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.

 Exemplo de entrada:

 Digite o nome:    João Silva

 Saída esperada:

 Nome sem espaços: João Silva
*/

 public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = scan.nextLine();
        nome = nome.trim();

        System.out.println("Nome sem espaços: "+ nome);
        scan.close();
    }
}
