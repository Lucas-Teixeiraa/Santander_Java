## **O que foi feito:**

O código principal está encapsulado na classe ContaBancaria.

  ***Atributos:***

 - **nomeCliente**: Armazena o nome completo do cliente (String).
 - **agencia**: Armazena o número da agência da conta (String).
 -  **numero:** Armazena o número da conta (int).
 -  **saldo:** Armazena o saldo da conta (double).

  ***Métodos***:
      

 - **criarConta():** O método principal que lida com o processo de criação da conta.
               Solicita ao usuário a opção de criar uma nova conta ("S") ou consultar saldo ("N").
               Baseado na opção selecionada, executa ações como coleta de dados do cliente, geração de dados da

conta e exibição de informações.

 - **gerarSaldo():**  Este método gera um saldo inicial aleatório para a conta.
       
 - **gerarNumeroAgencia()**: Este método  gera um número de agência aleatório no formato adequado.
 - **gerarNumeroConta()**: Este método gera um número de conta aleatório no formato adequado.

***Processo de Criação de Conta***

O método criarConta() gerencia o fluxo de criação da conta:

   Solicita a opção do usuário:
        Exibe uma mensagem perguntando se o usuário deseja criar uma nova conta ("S") ou consultar o saldo ("N").
        Lê a entrada do usuário e a converte para maiúsculas para comparação insensível a maiúsculas e minúsculas.

  ***Executa ações com base na opção:***
        

 - **Caso "S" (Criar conta):**
               Solicita ao usuário o nome completo.
               Solicita ao usuário o número da agência (usando sc.nextLine()).
               Solicita ao usuário o número da conta (usando sc.nextInt()).
               Chama métodos não implementados (gerarSaldo(), gerarNumeroAgencia(), gerarNumeroConta()) para gerar valores
   aleatórios para saldo, agência e número da conta, respectivamente.
               Exibe uma mensagem de boas-vindas ao cliente, mostrando nome, número da conta, agência e saldo inicial.
 - **Caso "N" (Consultar saldo):**
               Solicita ao usuário o número da agência e o número da conta (lógica para recuperação de detalhes da conta e exibição do
   saldo não implementada).
 - **Caso padrão:**
               Exibe uma mensagem de erro indicando uma opção inválida.
