package Exercicio7;
//Você está desenvolvendo um sistema de gerenciamento de tarefas pessoais para ajudar usuários a organizar suas
// atividades diárias. Cada tarefa precisa ser registrada com uma descrição e um status que indique se já foi
// concluída ou não. Seu objetivo é criar uma estrutura que armazene essas tarefas e permita visualizá-las.
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
//
//Opinião do instrutor
//•
//
//Opções
//Nesta atividade, você está praticando como representar múltiplas instâncias de uma entidade — no caso, tarefas —
// e como fazer com que cada uma delas controle sua própria exibição. A classe Tarefa possui os atributos descricao
// e concluida, e o metodo exibir() define como um objeto se apresenta com base em seu estado.
//
//O uso da estrutura condicional if (concluida) dentro do metodo mostra um comportamento do objeto.
// Em vez de apenas guardar dados, ele decide como se mostrar, tornando a lógica encapsulada. Isso é importante porque
// pode ter casos em que você pode ter várias formas de representar a mesma informação dependendo do contexto.
//
//A lista List<Tarefa> permite armazenar várias tarefas de forma organizada. Com o laço for, percorremos cada
// item da lista e chamamos o metodo exibir() individualmente, reforçando o princípio da responsabilidade de
//  cada objeto saber como se comportar.
//
//
//Copiar
//import java.util.ArrayList;
//import java.util.List;
//
//class Tarefa {
//    String descricao;
//    boolean concluida;
//
//    void exibir() {
//        if (concluida) {
//            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
//        } else {
//            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
//        }
//    }
//
//    public static void main(String[] args) {
//        Tarefa t1 = new Tarefa();
//        t1.descricao = "Estudar Java";
//        t1.concluida = false;
//
//        Tarefa t2 = new Tarefa();
//        t2.descricao = "Fazer exercícios";
//        t2.concluida = true;
//
//        List<Tarefa> lista = new ArrayList<>();
//        lista.add(t1);
//        lista.add(t2);
//
//        for (Tarefa t : lista) {
//            t.exibir();
//        }
//    }
//}
//Agora é sua vez! Teste o programa, compartilhe no fórum e compare sua lógica com outras soluções.

public class Main {
    public static void main(String[] args) {
        Tarefas t1 = new Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;
        t1.status();

        Tarefas t2 = new Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;
        t2.status();

    }
}
