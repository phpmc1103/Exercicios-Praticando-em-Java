package exercicio4;

/*
Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão.
Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.

Exemplo de entrada:

Digite o nome do arquivo: relatorio_final.pdf

Saída esperada:

Nome do arquivo sem extensão: relatorio_final
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeDoArquivo = scan.nextLine();

        int posicaoPonto = nomeDoArquivo.lastIndexOf(".");

        if (posicaoPonto == -1) {
            System.out.println("Arquivo sem extensão");
        } else {
            String arquivoSemExtensao = nomeDoArquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoSemExtensao);
        }
        scan.close();
    }
}