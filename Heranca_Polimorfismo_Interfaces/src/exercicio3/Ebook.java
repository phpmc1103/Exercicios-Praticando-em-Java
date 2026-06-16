package exercicio3;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("%s | E-book: %s - Formato: %s%n",codigo(),getTitulo(),formato);
    }
}
