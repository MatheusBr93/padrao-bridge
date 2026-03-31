Padrão Bridge
1. Objetivo

Implementar o padrão estrutural Bridge, desacoplando abstração e implementação.

2. Estrutura
Abstração:
Notificacao, NotificacaoSimples, NotificacaoUrgente
Implementação:
CanalEnvio, Email, Sms, WhatsApp
3. Funcionamento
Notificacao notificacao = new NotificacaoSimples(new Email());
notificacao.enviar("Mensagem de teste");
4. Execução
mvn clean compile exec:java
Testes:
mvn test
5. Justificativa

Evita criação de múltiplas combinações de classes e reduz acoplamento.

6. Conclusão

A solução melhora flexibilidade e manutenção.
