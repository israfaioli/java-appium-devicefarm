$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 25719291500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "login com sucesso",
  "description": "",
  "id": "login;login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu informe informe usuário \"qazando@gmail.com\" e senha \"1234\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu clicar no botão logar",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "vou visualizar a home do aplicativo",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "qazando@gmail.com",
      "offset": 32
    },
    {
      "val": "1234",
      "offset": 60
    }
  ],
  "location": "LoginSteps.que_eu_informe_informe_usuário_e_senha(String,String)"
});
formatter.result({
  "duration": 3340744400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.eu_clicar_no_botão_logar()"
});
formatter.result({
  "duration": 723825500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.vou_visualizar_a_home_do_aplicativo()"
});
formatter.result({
  "duration": 88900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Login com sucesso utilizando tabela",
  "description": "",
  "id": "login;login-com-sucesso-utilizando-tabela",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que eu informe informe usuário \"\u003cemail\u003e\" e senha \"\u003csenha\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "eu clicar no botão logar",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "vou visualizar a home do aplicativo",
  "keyword": "Entao "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login;login-com-sucesso-utilizando-tabela;",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ],
      "line": 17,
      "id": "login;login-com-sucesso-utilizando-tabela;;1"
    },
    {
      "cells": [
        "qazando@gmail.com",
        "1234"
      ],
      "line": 18,
      "id": "login;login-com-sucesso-utilizando-tabela;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1327263000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login com sucesso utilizando tabela",
  "description": "",
  "id": "login;login-com-sucesso-utilizando-tabela;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que eu informe informe usuário \"qazando@gmail.com\" e senha \"1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "eu clicar no botão logar",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "vou visualizar a home do aplicativo",
  "keyword": "Entao "
});
formatter.match({
  "arguments": [
    {
      "val": "qazando@gmail.com",
      "offset": 32
    },
    {
      "val": "1234",
      "offset": 60
    }
  ],
  "location": "LoginSteps.que_eu_informe_informe_usuário_e_senha(String,String)"
});
formatter.result({
  "duration": 2862132800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.eu_clicar_no_botão_logar()"
});
formatter.result({
  "duration": 739078700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.vou_visualizar_a_home_do_aplicativo()"
});
formatter.result({
  "duration": 19000,
  "status": "passed"
});
});