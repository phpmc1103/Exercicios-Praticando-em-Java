package exercicio4;

public class Email extends Notificacao {
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public void enviar() {
        System.out.println( "Enviando Email para: " + getDestinatario()+ "\n" +
                            "Assunto: " + assunto + "\n" +
                            "Corpo: " + getMensagem() + "\n");
    }
}
