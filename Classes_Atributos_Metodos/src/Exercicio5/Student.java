package Exercicio5;

public class Student {
    String name;
    double grade1, grade2;


    public void showSituation() {
        double average = (grade1 + grade2) / 2;
        System.out.printf("Aluno: %s%n", name);
        System.out.printf("Nota 1: %.1f%n", grade1);
        System.out.printf("Nota 2: %.1f%n", grade2);
        System.out.printf("Média: %.1f%n" , average);

        System.out.println("Situação: " + (average >= 7 ? "Aprovado" : "Reprovado"));

    }
}
