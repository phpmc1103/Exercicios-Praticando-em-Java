import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercicio2 {
    //Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários.
    // Esses relatórios incluem informações como transações realizadas,
    // atualizações de pedidos e registros de atendimento ao cliente.
    // A equipe responsável pela análise dos relatórios solicitou que a data e a hora sejam exibidas
    // em um formato mais familiar para os usuários brasileiros.
    //Para resolver essa tarefa, você deve:
    //
    //Capturar a data e a hora atuais.
    //Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
    //Formatar a hora no padrão HH:mm (hora e minutos).
    //Exibir o resultado da formatação.
    //Saída esperada:
    //
    //Data formatada: 15-03-2025
    //Hora formatada: 14:30
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = date.format(formattedDate);
        String timeFormatado = time.format(formattedTime);


        System.out.println("Data formatada: "+dataFormatada);
        System.out.println("Hora formatada: "+timeFormatado);



    }
}
