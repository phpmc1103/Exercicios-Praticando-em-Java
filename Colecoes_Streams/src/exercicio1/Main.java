package exercicio1;
/*
Você está desenvolvendo um sistema para gerenciar os nomes dos funcionários de uma empresa de tecnologia.
 O sistema precisa permitir que novos funcionários sejam adicionados a uma lista de nomes.

Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria",
 " Vitor" e “Ana” a essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.

Saída esperada:

 Lista de funcionários: [João, Maria, Vitor, Ana]

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("João");
        lista.add("Maria");
        lista.add("Vitor");
        lista.add("Ana");

        System.out.println(lista);

    }
}
