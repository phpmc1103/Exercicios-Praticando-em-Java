package Exercicio7;

public class Tarefas {
    String descricao;
    boolean concluida;
    String resultado;

    public void status(){
        if (concluida){
           resultado = "Concluída";
        }else {
          resultado = "Pendente";
        }
        System.out.println("Tarefa: "+descricao+ " -  Status: "+resultado);

    }
}
