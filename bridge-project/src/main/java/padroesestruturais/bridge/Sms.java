package padroesestruturais.bridge;

public class Sms implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "SMS enviado: " + mensagem;
    }
}
