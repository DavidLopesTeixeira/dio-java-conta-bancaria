
# Sistema de Conta Bancária

Este é um programa simples de conta bancária em Java. Ele permite que um cliente realize operações básicas como consultar saldo, depositar dinheiro e realizar saques. O programa interage com o usuário via terminal, exibindo um menu de opções para que ele possa escolher as ações que deseja executar.

## Funcionalidades
- **Verificar Saldo**: Exibe o saldo atual da conta bancária.
- **Depositar**: Permite que o cliente deposite um valor na conta.
- **Sacar**: Permite que o cliente saque um valor da conta, desde que o saldo seja suficiente.
- **Menu Interativo**: O programa oferece um menu com as opções disponíveis e continua rodando até que o cliente escolha a opção de sair.

## Estrutura do Programa

O programa é dividido em três classes principais:

1. **Cliente**: Armazena os dados do cliente, como nome, agência e número da conta.
2. **ContaTerminal**: Gerencia as operações da conta bancária, como depósito, saque e controle do saldo.
3. **Main**: A classe principal, onde o programa é executado e interage com o cliente via terminal.

## Como Executar o Programa

### Pré-requisitos
- Você precisa ter o **JDK (Java Development Kit)** instalado em seu sistema. Para verificar, execute o comando no terminal:
  ```bash
  java -version
  ```
  Se o JDK não estiver instalado, você pode baixá-lo no [site oficial do Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou instalar via gerenciador de pacotes (por exemplo, `sudo apt install openjdk-11-jdk` no Linux).

### Compilação e Execução

1. **Baixe o código** ou copie os arquivos para seu ambiente de desenvolvimento.
   
2. **Compile os arquivos Java**. Se você estiver no diretório onde os arquivos Java (`Cliente.java`, `ContaTerminal.java` e `Main.java`) estão localizados, execute o seguinte comando no terminal:
   ```bash
   javac *.java
   ```
   Esse comando vai compilar todos os arquivos `.java` no diretório atual.

3. **Execute o programa**. Após a compilação bem-sucedida, você pode executar o programa com o comando:
   ```bash
   java Main
   ```

### Exemplo de Execução

Quando você rodar o programa, ele solicitará que você insira os dados do cliente:

```bash
Digite o nome do cliente: João
Digite a agência: 1234
Digite o número da conta: 567890
Digite o saldo inicial: 500
```

Em seguida, um menu será exibido com as opções disponíveis:

```bash
Bem-vindo(a), João! Escolha uma opção:
1. Verificar Saldo
2. Depositar
3. Sacar
4. Sair
Escolha uma opção:
```

Você pode selecionar a opção desejada digitando o número correspondente. O programa continuará rodando até que a opção "Sair" seja escolhida.

### Estrutura de Arquivos

```
src/
├── Cliente.java          # Classe que representa o cliente
├── ContaTerminal.java    # Classe que gerencia as operações da conta bancária
└── Main.java             # Classe principal que executa o programa
```

## Contribuição

Se você quiser contribuir para a melhoria deste projeto, sinta-se à vontade para fazer um fork, enviar pull requests ou abrir issues com sugestões ou problemas que encontrar.

## Licença

Este projeto é de código aberto, e você pode utilizá-lo conforme achar necessário.
