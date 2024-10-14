package notificacao;

public class NotificacaoSMS implements INotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
