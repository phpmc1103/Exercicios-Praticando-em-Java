package exercicio1;
//Você está desenvolvendo um sistema para uma oficina mecânica registrar os veículos que chegam para manutenção.
//Cada carro precisa ser identificado com algumas informações para o controle interno.
//
//Crie um programa que:
//
//Defina uma classe com os atributos modelo, placa e ano.
//Defina uma instancia dessa classe através do metodo construtor.
//Exiba as informações do veículo no console.
//Exemplo de entrada:
//
//
//Copiar
//Carro gol = new Carro("Gol", "ABC-1234", 2020);
//
//Saída esperada:
//
//
//Copiar
//Veículo cadastrado:
//Modelo: Gol
//Placa: ABC-1234
//Ano: 2020

public class Main {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado: ");
        System.out.println("Modelo: "+gol.getModelo());
        System.out.println("Placa: "+gol.getPlaca());
        System.out.println("Ano: "+gol.getAno());
    }
}
