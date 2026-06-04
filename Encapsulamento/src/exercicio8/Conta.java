package exercicio8;

public class Conta {
    private String login;
    private String senha;

    public Conta(String login,String senha) {
        this.login = login;
        this.senha = senha;
    }
    public void validarSenha(){
        System.out.println("Login bem-sucedido!");
    }
}