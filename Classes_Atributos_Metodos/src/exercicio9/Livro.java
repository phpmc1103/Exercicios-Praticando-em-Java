package exercicio9;

public class Livro {
    private String titulo;
    private int diasDeAtraso;


    public Livro(String titulo, int diasDeAtraso) {
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }
    public double multaTotal(double multa){
        return multa * diasDeAtraso;
    }
    public void exibirDetalhes(){
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f",titulo,diasDeAtraso,multaTotal(2.50));
    }


}
