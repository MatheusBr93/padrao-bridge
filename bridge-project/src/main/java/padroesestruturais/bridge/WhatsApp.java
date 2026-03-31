package padroesestruturais.bridge;

public class WhatsApp implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "WhatsApp enviado: " + mensagem;
    }
}
