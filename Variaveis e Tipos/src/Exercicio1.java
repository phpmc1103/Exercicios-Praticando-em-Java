public class Exercicio1 {
    //Você está começando seus primeiros passos na programação em Java e deseja reforçar seu aprendizado sobre declaração de variáveis.
    //Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante,
    //utilizando os tipos apropriados, e depois exiba os valores armazenados.
    //
    //Saída esperada:
    //Nome: Maria
    //Idade: 25
    //Altura: 1.68
    //É estudante: true
    public static void main(String[] args) {

         String nome = "Maria";
         int idade = 25;
         double altura = 1.68;
         boolean serEstudante = true;

        System.out.printf("""  
                Nome: %s
                Idade: %d
                Altura: %.2f
                E estudante: %b
                """, nome, idade, altura, serEstudante);

    }
}
