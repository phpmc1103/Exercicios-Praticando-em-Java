package exercicio2;

public class Aluno extends Pessoa{
    protected double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }
    @Override
    public void exibirDados(){
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.2f%n",nome,idade,nota);
    }
}
