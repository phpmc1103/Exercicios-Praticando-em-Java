package Exercicio7;

public class Tarefas {
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }


    public void status () {
            String resultado;
            if (concluida) {
                resultado = "Concluída";
            } else {
                resultado = "Pendente";
            }
            System.out.println("Tarefa: " + descricao + " -  Status: " + resultado);

    }
}

