package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificacaoBridgeTest {

    @Test
    void deveEnviarNotificacaoSimplesPorEmail() {
        CanalEnvio canal = new Email();
        Notificacao notificacao = new NotificacaoSimples(canal);

        assertEquals(
                "E-mail enviado: [SIMPLES] Relatório disponível",
                notificacao.enviar("Relatório disponível")
        );
    }

    @Test
    void deveEnviarNotificacaoUrgentePorSms() {
        CanalEnvio canal = new Sms();
        Notificacao notificacao = new NotificacaoUrgente(canal);

        assertEquals(
                "SMS enviado: [URGENTE] SERVIDOR FORA DO AR",
                notificacao.enviar("Servidor fora do ar")
        );
    }

    @Test
    void deveTrocarCanalSemTrocarATipoDaNotificacao() {
        Notificacao notificacao = new NotificacaoUrgente(new Email());
        notificacao.setCanalEnvio(new WhatsApp());

        assertEquals(
                "WhatsApp enviado: [URGENTE] CLIENTE VIP AGUARDANDO RETORNO",
                notificacao.enviar("Cliente VIP aguardando retorno")
        );
    }
}
