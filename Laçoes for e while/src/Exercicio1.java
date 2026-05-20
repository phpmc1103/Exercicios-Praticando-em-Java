import java.util.Scanner;

public class Exercicio1 {
    //Carla começou a praticar trilha e deseja saber quantos degraus precisará subir para chegar ao topo de uma escadaria.
    // Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
    // Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.
    //
    //Exemplo de entrada:
    //
    //Digite a quantidade de degraus: 5
    //
    //Saída esperada:
    //
    //Subindo o degrau 1
    //Subindo o degrau 2
    //Subindo o degrau 3
    //Subindo o degrau 4
    //Subindo o degrau 5
    //Você chegou ao topo!

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = scan.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " +i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
