package exercicio8;

public class Conta {
    private String login;
    private String senha;

    public Conta(String login,String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}