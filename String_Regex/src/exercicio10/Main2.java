package exercicio10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scan.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%&*!?._-]).{8,}$";

        if(senha.matches(regex)){
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha é inválida.");
        }

    }
}