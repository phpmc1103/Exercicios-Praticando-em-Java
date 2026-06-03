package exercicio6;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void depositar(double deposito){
        if(deposito > 0) this.saldo += deposito;
        else{
            System.out.println("Depósito não autorizado");
        }
    }
    public void sacar(double saque){
        if(this.saldo >= saque && saque > 0) this.saldo-= saque;
        else{
            System.out.println("Saque não permitido.");
        }
    }
    public void exibirSaldo(){
        System.out.printf("Saldo atual de %s: %.2f%n",titular,saldo);
    }
}
