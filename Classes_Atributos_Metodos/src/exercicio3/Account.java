package Exercicio3;

public class Account {
    double balance;

    public void closeAccount(){
        balance = 0;
    }
    public void showBalance(){
        System.out.printf("Saldo atual: R$%.2f%n",balance);
    }
}
