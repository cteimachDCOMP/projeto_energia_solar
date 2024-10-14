package notificacao;

public class SistemaNotificacao {

    public void notificarSolicitacaoProjeto(String destinatario, INotificacao notificacao) {
        String mensagem = "Um novo projeto foi solicitado.";
        notificacao.enviar(destinatario, mensagem);
    }

    public void notificarConclusaoOrcamento(String destinatario, INotificacao notificacao) {
        String mensagem = "Seu orçamento está pronto!";
        notificacao.enviar(destinatario, mensagem);
    }
}
