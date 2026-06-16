package exercicio2;

public class Docente extends Pessoa{
    protected String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    @Override
    public void exibirDados(){
        System.out.printf("Docente: %s - Idade: %d - Disciplina: %s%n",nome,idade,disciplina);
    }
}
