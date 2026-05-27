package Exercicio6;

public class Colaborador {
    String nome;
    String cargo;
    int nivelDeAcesso;

    public void mudar(String novoCargo, int novoNivel){
        this.cargo = novoCargo;
        this.nivelDeAcesso = novoNivel;
    }
}
