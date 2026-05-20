import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Carlos tem uma lista de números e quer descobrir qual é o maior valor.
        // Para isso, ele decidiu percorrer a lista comparando cada número com o maior encontrado até o momento.
        // Crie um programa que receba uma lista de números e encontre o maior número.
        //
        //Exemplo de entrada:
        //
        //Digite os números separados por espaço: 3 7 2 9 5
        //
        //Saída esperada:
        //
        //O maior número é: 9
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String numeros = scan.nextLine();

        // Divide a String pelo espaço e guarda cada número como String no array
        String[] split = numeros.split("\\s+");

        // Pega o primeiro número do array como maior inicial para ter um ponto de comparação e converte esse número de String para Inteiro.
        int maior = Integer.parseInt(split[0]);

        //Percorre cada parte do array
        for(String parte : split){
            //Converte cada parte do array em Inteiro
            int numero = Integer.parseInt(parte);

            //Se o número atual for maior que o maior encontrado até agora, atualiza o maior
            if(numero > maior){
                maior = numero;
            }

        }

        System.out.println("O maior número é: " +maior);


    }
}
