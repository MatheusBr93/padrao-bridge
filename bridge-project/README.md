# Projeto Bridge

## Como executar

### Opção 1: via Maven
```bash
mvn clean compile exec:java
```

### Opção 2: compilando manualmente
```bash
mvn clean compile
java -cp target/classes padroesestruturais.bridge.Main
```

## Erro comum
Se você executar apenas:
```bash
java padroesestruturais.bridge.Main
```
o Java não encontra a classe, porque o classpath não aponta para `target/classes`.
