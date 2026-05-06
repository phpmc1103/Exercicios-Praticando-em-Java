public class Exercicio7 {
    //Você está desenvolvendo um jogo e quer um programa que determine se um número é par ou ímpar.
    //Escreva um programa que classifique um número e exiba uma mensagem informando se o número é par ou ímpar.
    //Exemplo de entrada:
    //
    //int numero = 7;
    //
    //Saída esperada:
    //
    //O número é ímpar.

    public static void main(String[] args) {
        int numero = 7;
        String condicional;
        if(numero % 2 == 0){
            condicional = "par";
        }else {
            condicional = "ímpar";
        }
        System.out.println("O número é " +condicional+ ".");
    }
}
