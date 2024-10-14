package notificacao;

public class NotificacaoEmail implements INotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
