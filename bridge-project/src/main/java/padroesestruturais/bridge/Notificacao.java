package padroesestruturais.bridge;

public abstract class Notificacao {
    protected CanalEnvio canalEnvio;

    public Notificacao(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    public void setCanalEnvio(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    public abstract String enviar(String conteudo);
}
