package notificacao;

public class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando email para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}

