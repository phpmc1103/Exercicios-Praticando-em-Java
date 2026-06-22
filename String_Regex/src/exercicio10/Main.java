package exercicio10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas.
A senha deve ter pelo menos:
8 caracteres
Uma letra maiúscula
Uma letra minúscula
Um número
Um caractere especial
Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.

Exemplo de entrada:

Digite a senha: Senha123!

Saída esperada:

A senha é válida.

 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = scan.nextLine();

        Pattern pattern1 = Pattern.compile("\\d");
        Matcher matcher1 = pattern1.matcher(senha);

        Pattern pattern2 = Pattern.compile("[A-Z]");
        Matcher matcher2 = pattern2.matcher(senha);

        Pattern pattern3 = Pattern.compile("[a-z]");
        Matcher matcher3 = pattern3.matcher(senha);

        Pattern pattern4 = Pattern.compile("[@#$%&*!?._-]");
        Matcher matcher4 = pattern4.matcher(senha);


        if(senha.length() >= 8){
            if(matcher1.find() && matcher2.find() && matcher3.find() && matcher4.find()) {
                System.out.println("A senha é valida.");
            } else {
                System.out.println("A senha é inválida.");
            }
        } else {
            System.out.println("A senha deve ter pelo menos 8 caractéres");
        }
    }
}
