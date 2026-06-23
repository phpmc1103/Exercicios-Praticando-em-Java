package exercicio7;
/*
Imagine que a equipe de RH precisa gerar relatórios específicos com listas de funcionários
cujos nomes tenham um determinado número de caracteres ou menos para facilitar segmentações internas.
 Para isso, você deve ajudá-los desenvolvendo um programa capaz de:

Criar uma lista contendo os nomes dos funcionários.
Filtrar apenas os nomes que tenham menos de 5 caracteres ou exatamente 5 caracteres.
Criar uma lista contendo os nomes filtrados.
Exibir a lista filtrada no console.
Exemplo de entrada:

List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

Saída esperada:

[Ana, Bruno, Alice]

 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String>funcionarios5 = funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .toList();
        System.out.println(funcionarios5);

    }

}
