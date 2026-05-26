package Exercicio3;
//Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras.
// Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.
//
//Crie um programa que:
//
//Defina uma classe com o atributo saldo.
//Implemente um metodo que redefine o valor do saldo para 0.0.
//Implemente um metodo que mostra o saldo atual formatado.
//Exemplo de entrada:
//
//conta.saldo = 1579.42;
//
//conta.exibirSaldo();
//conta.zerarSaldo();
//conta.exibirSaldo();
//Copiar código
//Saída esperada:
//
//Saldo atual: R$ 1579.42
//Saldo atual: R$ 0.00

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.balance = 1579.42;

        account1.showBalance();
        account1.closeAccount();
        account1.showBalance();

    }
}
