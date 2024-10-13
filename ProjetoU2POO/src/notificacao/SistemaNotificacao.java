package notificacao;

public class SistemaNotificacao {

    public void notificarSolicitacaoProjeto(String destinatario) {
        String mensagem = "Um novo projeto foi solicitado.";
        Notificacao notificacao = new NotificacaoEmail(destinatario, mensagem); // ou NotificacaoSMS, NotificacaoApp
        notificacao.enviar();
    }

    public void notificarConclusaoOrcamento(String destinatario) {
        String mensagem = "Seu orçamento está pronto!";
        Notificacao notificacao = new NotificacaoEmail(destinatario, mensagem); // ou NotificacaoSMS, NotificacaoApp
        notificacao.enviar();
    }
}
