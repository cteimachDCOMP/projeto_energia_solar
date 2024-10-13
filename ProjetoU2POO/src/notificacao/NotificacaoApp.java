package notificacao;

public class NotificacaoApp extends Notificacao {

    public NotificacaoApp(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação via WhatsApp para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}
