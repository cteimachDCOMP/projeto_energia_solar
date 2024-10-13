package notificacao;

public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
