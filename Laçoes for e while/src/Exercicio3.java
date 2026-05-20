public class Exercicio3 {
    //Maria quer calcular a soma de todos os números pares de 1 a 100.
    // Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2.
    // Crie um programa que realize essa tarefa.
    //
    //Saída esperada:
    //
    //A soma dos números pares de 1 a 100 é: 2550
    public static void main(String[] args) {
        int valorFinal = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 0) {
                valorFinal += i;
            }
        }
        System.out.printf("A soma dos números pares de 1 a 100 é: %d",valorFinal);
    }
}
