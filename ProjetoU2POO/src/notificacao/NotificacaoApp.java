package notificacao;

public class NotificacaoApp implements INotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando notificação via App para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
