public class Exercicio5 {
 //Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de cadastro de livros
    // que será escolhida através de um único caractere. O sistema armazenar em variáveis:
    //
    //    Título
    //    Autor
    //    Número de páginas
    //    Preço de um livro
    //    Categoria do livro As categorias disponíveis são:
    //    F - Ficção
    //    N - Não-ficção
    //    T - Tecnologia
    //    H - História
    //
    //Escreva um programa que armazene em variáveis as informações de um livro e com base na categoria armazenada
    // exiba uma mensagem de confirmação de acordo com o que foi escolhido.
    //
    //Exemplo de entrada:
    //
    //char categoria = 'F';
    //
    //Saída esperada:
    //
    //Livro cadastrado: "O Pequeno Príncipe", de Antoine de Saint-Exupéry.
    // Ele possui 96 páginas, custa R$39,9 e pertence à categoria Ficção.
 public static void main(String[] args) {

     String titulo= "", autor  ="";
     int numeroDePaginas = 0;
     double preco = 0;
     char categoria = 'F';
     String nomeDaCategoria = "";

     if(categoria == 'F'){
         nomeDaCategoria = "Ficção";
         titulo = "O Pequeno Príncipe";
         autor = "Antoine de Saint-Exupéry";
         numeroDePaginas = 96;
         preco = 39.9;
     }else if(categoria == 'N'){
         nomeDaCategoria = "Não-Ficção";
         titulo = "A Queda do Céu";
         autor = "Davi Kopenawa";
         numeroDePaginas = 768 ;
         preco = 125;
     } else if (categoria == 'T') {
         nomeDaCategoria = "Tecnologia";
         titulo = "Código limpo";
         autor = " Robert C. Martin";
         numeroDePaginas = 425;
         preco = 92.16 ;
     } else if(categoria == 'H'){
         nomeDaCategoria = "Historia";
         titulo = "Sapiens";
         autor = " Yuval Noah Harari";
         numeroDePaginas = 472 ;
         preco = 51.20;
     }else {
         System.out.println("Categoria inexistente");
         }

         System.out.println("Livro cadastrado: \"" + titulo + "\" , de " + autor +
                 ". Ele possui " + numeroDePaginas + " páginas, custa R$" + preco +
                 " e pertence a categoria " + nomeDaCategoria);
 }
}
