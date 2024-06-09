#language: pt

Funcionalidade: Login

    @test
    Cenario: login com sucesso
      Dado que eu informe informe usuário "qazando@gmail.com" e senha "1234"
      Quando eu clicar no botão logar
      Entao vou visualizar a home do aplicativo

    @regression
    Esquema do Cenário: Login com sucesso utilizando tabela
      Dado que eu informe informe usuário "<email>" e senha "<senha>"
      Quando eu clicar no botão logar
      Entao vou visualizar a home do aplicativo
      Exemplos:
      |email            |senha|
      |qazando@gmail.com|1234 |