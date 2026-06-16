package exercicio3;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("%s | Livro: %s - Autor: %s%n",codigo(),getTitulo(),autor);
    }
}
