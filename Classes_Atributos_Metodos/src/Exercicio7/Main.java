package Exercicio7;
//Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários
// a organizar suas atividades diárias. Cada tarefa precisa ser registrada com uma descrição e um status que indique
// se já foi concluída ou não. Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.
//
//Crie um programa que:
//
//Defina uma classe com os atributos descrição e concluída.
//Implemente um metodo que mostre a descrição da tarefa e seu status.
//Crie uma lista de tarefas e exiba todas as tarefas cadastradas. Dica: use ArrayList.
//Exemplo de entrada:
//
//
//Copiar
//Tarefa t1 = new Tarefa();
//t1.descricao = "Estudar Java";
//t1.concluida = false;
//
//Tarefa t2 = new Tarefa();
//t2.descricao = "Fazer exercícios";
//t2.concluida = true;
//
//Saída esperada:
//
//
//Copiar
//Tarefa: Estudar Java - Status: Pendente
//Tarefa: Fazer exercícios - Status: Concluída

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tarefas t1 = new Tarefas("Estudar Java", false);
        Tarefas t2 = new Tarefas("Fazer Exercícios", true);

        List<Tarefas> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefas t : lista) {
            t.status();
        }
    }
}