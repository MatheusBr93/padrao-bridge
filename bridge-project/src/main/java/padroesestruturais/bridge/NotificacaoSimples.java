package padroesestruturais.bridge;

public class NotificacaoSimples extends Notificacao {
    public NotificacaoSimples(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public String enviar(String conteudo) {
        return canalEnvio.enviarMensagem("[SIMPLES] " + conteudo);
    }
}
