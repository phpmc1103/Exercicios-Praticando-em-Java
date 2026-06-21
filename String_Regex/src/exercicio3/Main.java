package exercicio3;

/*Ana está desenvolvendo um sistema de edição de textos e precisa substituir
 uma palavra específica por outra em um texto. Crie um programa que:

 Receba um texto, uma palavra a ser substituída e uma nova palavra,
  exiba o texto com as substituições realizadas.
 Se a palavra a ser substituída não for encontrada no texto,
  o programa deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.
 Exemplo de entrada:

 Digite o texto: O gato caça o rato.
 Digite a palavra a ser substituída: gato
 Digite a nova palavra: cachorro

 Saída esperada:

 Texto modificado: O cachorro caça o rato.
 */


import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Digite o texto: ");
         String texto = scan.nextLine();
         System.out.print("Digite a palavra a ser substituída: ");
         String palavraSubs = scan.nextLine();
         System.out.print("Digite a nova palavra: ");
         String novaPalavra = scan.nextLine();

         if(texto.contains(palavraSubs)) {
             String novoTexto = texto.replace(palavraSubs, novaPalavra);
             System.out.println("Texto modificado: "+novoTexto);
         } else {
             System.out.println("A palavra não foi encontrada.");
         }
         scan.close();

     }
}
