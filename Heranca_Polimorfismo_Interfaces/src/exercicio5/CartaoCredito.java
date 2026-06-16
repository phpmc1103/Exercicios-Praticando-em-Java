package exercicio5;

public class CartaoCredito extends Pagamento implements CalculadorDeTaxa{
    private double taxa = 3;

    public CartaoCredito(double valor) {
        super(valor);
    }
    public double calculoDeTaxa(){
        return getValor() * (taxa/100);
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " confirmado no Cartão de Crédito" +
                " (Taxa: R$" + calculoDeTaxa() + ")");
    }
}
