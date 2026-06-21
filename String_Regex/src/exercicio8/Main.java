package exercicio8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os números de CPF fornecidos.
 Ele quer um programa que verifique se o CPF está no formato correto (XXX.XXX.XXX-XX).

Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está no formato válido.

Exemplo de entrada:

Digite o CPF: 123.456.789-09

Saída esperada:

O CPF 123.456.789-09 está no formato válido.

 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scan.nextLine();

        Pattern pattern = Pattern.compile("(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})|(\\d{11})" );
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()){
            System.out.println("O CPF " + cpf + " está no formato válido.");

        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");

        }
        scan.close();


    }
}
