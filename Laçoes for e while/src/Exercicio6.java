import java.util.Scanner;

public class Exercicio6 {
    //Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número
    // limitado de tentativas para inserir a senha corretamente. Se o usuário errar a senha 3 vezes seguidas,
    // sua conta deve ser bloqueada temporariamente.
    //
    //Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso.
    // Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.
    //
    //Exemplo de entrada:
    //
    //Digite sua senha: 1234
    //
    //Saída esperada:
    //
    //Senha Correta! Acesso concedido!
    //
    //ou
    //
    //Exemplo de entrada:
    //
    //Digite sua senha: 1111
    //Senha incorreta. Você tem 2 tentativas restantes.
    //Digite sua senha: 2222
    //Senha incorreta. Você tem 1 tentativa restante.
    //Digite sua senha: 3333
    //
    //Saída esperada:
    //
    //Conta bloqueada temporariamente.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senhaCorreta = "1234";
        int tentativasRestantes = 2;

        //laço corta se a senha tiver errado ou passar de tres rotaçoes.

        for (int i = 0; i < 3; i++) {

            System.out.print("Digite sua senha:");
            String senha = scan.nextLine();
            if (senhaCorreta.equals(senha)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativasRestantes == 0) {
                System.out.println("Conta bloqueada temporariamente.");
                break;
            } else {
                System.out.println("Senha incorreta. Você tem " + tentativasRestantes + " tentativas restantes.  ");
                tentativasRestantes--;
            }


        }

    }
}