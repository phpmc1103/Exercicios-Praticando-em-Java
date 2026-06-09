package exercicio9;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    public void ganharPontos(int ganho){
        this.pontos += ganho;
        atualizacaoDeNivel();
    }
    private void atualizacaoDeNivel(){
        this.nivel = (pontos / 100) + 1;

    }
    public void exibirStatus(){
        System.out.printf("""
                
                Nome: %s
                Pontos: %d
                Nível: %d
                """,nome,pontos,nivel);
    }

}
