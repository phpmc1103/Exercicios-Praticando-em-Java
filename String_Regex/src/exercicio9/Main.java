package exercicio9;
/*
Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas as hashtags de um texto.
 Ela quer um programa que encontre todas as palavras que começam com "#".

Crie um programa que receba um texto e exiba todas as hashtags encontradas.

Exemplo de entrada:

Digite o texto: Olá #mundo! Estou aprendendo #Java e #programação.

Saída esperada:

Hashtags encontradas: #mundo, #Java, #programação
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scan.nextLine();

        Pattern pattern = Pattern.compile("#[\\wÀ-ÿ]+");
        Matcher matcher = pattern.matcher(texto);



        List<String> lista = new ArrayList<>();

        while (matcher.find()) {

            lista.add(matcher.group());

        }

        if(lista.isEmpty()){
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ",lista));
        }
    }

}
