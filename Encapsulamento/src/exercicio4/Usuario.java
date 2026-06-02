package exercicio4;

public class Usuario {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }
    public void setSenha(String velhaSenha, String novaSenha) {
        if(this.senha.equals(velhaSenha)){
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
        }else{
            System.out.println("Senha atual incorreta. A senha não foi alterada.");

        }
    }
}
