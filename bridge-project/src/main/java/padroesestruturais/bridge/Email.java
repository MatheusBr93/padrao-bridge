package padroesestruturais.bridge;

public class Email implements CanalEnvio {
    @Override
    public String enviarMensagem(String mensagem) {
        return "E-mail enviado: " + mensagem;
    }
}
