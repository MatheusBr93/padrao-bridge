package padroesestruturais.bridge;

public class Main {
    public static void main(String[] args) {
        CanalEnvio email = new Email();
        CanalEnvio sms = new Sms();
        CanalEnvio whatsapp = new WhatsApp();

        Notificacao notificacao1 = new NotificacaoSimples(email);
        Notificacao notificacao2 = new NotificacaoUrgente(sms);
        Notificacao notificacao3 = new NotificacaoUrgente(whatsapp);

        System.out.println(notificacao1.enviar("Relatório mensal disponível"));
        System.out.println(notificacao2.enviar("Servidor principal indisponível"));
        System.out.println(notificacao3.enviar("Cliente estratégico aguardando retorno"));
    }
}
