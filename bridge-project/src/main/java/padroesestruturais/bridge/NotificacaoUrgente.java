package padroesestruturais.bridge;

public class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public String enviar(String conteudo) {
        return canalEnvio.enviarMensagem("[URGENTE] " + conteudo.toUpperCase());
    }
}
