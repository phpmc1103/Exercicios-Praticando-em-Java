package exercicio3;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("%s | Revista: %s - Edição: %d%n",codigo(),getTitulo(),edicao);
    }
}
