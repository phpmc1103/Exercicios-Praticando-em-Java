package exercicio6;

public class Notificacao {

    public void enviarMensagem(String mensagem){
        System.out.println("Mensagem enviada para todos: " +mensagem);
    }

    public void enviarMensagem(String nome,String mensagem){
        System.out.println("Mensagem para " + nome + ": " +mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int quantidade){
        for (int i = 0; i < quantidade; i++) {
            enviarMensagem(nome, mensagem);
        }
    }

}
