import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio3 {
    //Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento.
    // Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos
    // sejam executados dentro do prazo.
    //
    //Para isso, crie um programa que:
    //
    //    Receba dois horários representando o início e o término de uma atividade.
    //    Calcule a diferença em horas e minutos entre esses dois horários.
    //    Exiba o resultado formatado.
    //
    //Saída esperada:
    //
    //Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:
    //
    //Diferença de tempo: 2 horas e 15 minutos
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Horário do inicio: ");
        String inicio = scan.nextLine();
        System.out.printf("Horário do término: ");
        String fim = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime horaInicial = LocalTime.parse(inicio, formatter);
        LocalTime horaFinal = LocalTime.parse(fim, formatter);

        Duration diferenca = Duration.between(horaInicial, horaFinal);
        long resultadoEmHoras = diferenca.toHours();
        long resultadoEmMinutos = diferenca.toMinutesPart();

        System.out.println("Diferença de tempo: " +resultadoEmHoras+ " horas e "+resultadoEmMinutos +" minutos");


    }
}
