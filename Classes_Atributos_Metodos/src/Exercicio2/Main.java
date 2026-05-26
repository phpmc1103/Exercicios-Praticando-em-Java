package Exercicio2;
//Imagine que você está criando um sistema de catalogação para uma biblioteca.
// Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado,
// facilitando a consulta por outros leitores.
//
//Crie um programa que:
//
//Defina uma classe com os atributos título, autor e páginas.
//Implemente um metodo que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
//Exemplo de entrada:
//
//l.titulo = "O Guia do Mochileiro das Galáxias";
//l.autor = "Douglas Adams";
//l.paginas = 208;
//Copiar código
//Saída esperada:
//
//"O Guia do Mochileiro das Galáxias" de Douglas Adams com 208 páginas

public class Main {
    public static void main(String[] args) {


        Books book1 = new Books();
        book1.title = "O Guia do Mochileiro das Galáxias";
        book1.author = "Douglas Adams";
        book1.pages = 208;
        book1.displayInfo();
    }
}
