public class Exercicio2 {
//Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:
//
//    O estudante é aprovado se média final é maior ou igual a 7.0.
//
//    Se a média for entre 5.0 e 6.9, está de recuperação.
//
//    Se for abaixo de 5.0, está reprovado.
//
//Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.
//
//Saída esperada:
//
//O estudante teve média 8.2 e foi aprovado.
//
//Ou
//
//O estudante teve média 5.8 e está de recuperação.
//
//Ou
//
//O estudante teve média 4.3 e foi reprovado.
public static void main(String[] args) {

    double nota1 = 7, nota2 = 9.4, media;
    media = (nota1 + nota2) / 2;
    if (media >= 7) {
        System.out.println("O estudante teve média " + media + " e foi aprovado.");
    }else if(media >= 5){
        System.out.println("O estudante teve média " + media + " e está de recuperação.");
    }else{
        System.out.println("O estudante teve média "+media+ " e foi reprovado.");
    }

    }
}
