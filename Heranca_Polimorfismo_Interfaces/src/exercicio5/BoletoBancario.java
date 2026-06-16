package exercicio5;

public class BoletoBancario extends Pagamento implements CalculadorDeTaxa{
    private double taxa = 1;

    public BoletoBancario(double valor) {
        super(valor);
    }
    public double calculoDeTaxa(){
        return getValor() * (taxa/100);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Boleto de R$" + getValor() + " gerado com sucesso (Taxa: R$" + calculoDeTaxa() + ")");
    }
}
