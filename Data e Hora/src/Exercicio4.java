import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio4 {
    //Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
    // Para garantir que os prazos sejam cumpridos, você precisa calcular a data de entrega de cada projeto
    // com base na data de início e no prazo estimado em dias.
    //
    //Você precisa criar um programa que:
    //
    //    Receba uma data de início.
    //    Adicione o prazo em dias ao início do projeto.
    //    Exiba a data final formatada corretamente.
    //
    //Saída esperada:
    //
    //Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
    //
    //Data de entrega: 30-03-2025
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LocalDate dataInicio = LocalDate.of(2025,3,15);

        System.out.print("Defina o prazo de entrega: ");
        int prazo = scan.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate dataDeEntrega = dataInicio.plusDays(prazo);

        System.out.println("Data de entrega: " + dataDeEntrega.format(formatter));

    }
}
