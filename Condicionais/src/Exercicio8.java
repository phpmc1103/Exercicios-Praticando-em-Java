import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    //Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
    // Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
    // Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar um triângulo ou não.
    //
    //Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem
    // informando se os lados podem formar um triângulo ou não.
    //
    //Exemplo de entrada:
    //
    //Digite o primeiro lado: 3
    //Digite o segundo lado: 4
    //Digite o terceiro lado: 5
    //
    //Saída esperada:
    //
    //Os lados podem formar um triângulo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        int lado1 = scan.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = scan.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = scan.nextInt();

        List<Integer> lados = new ArrayList<>();
        lados.add(lado1);
        lados.add(lado2);
        lados.add(lado3);
        Collections.sort(lados);

        if(lados.get(0) + lados.get(1)> lados.get(2)){
            System.out.println("Os lados podem formar um triângulo.");
        }else{
            System.out.println("Os lados NÃO podem formar um triângulo.");
        }

    }

}
