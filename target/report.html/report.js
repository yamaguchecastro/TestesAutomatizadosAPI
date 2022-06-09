$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("get.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 3,
      "value": "#Author: yamaguche@hotmail.com"
    }
  ],
  "line": 6,
  "name": "Consultar restrição de cpf",
  "description": "Como usuario quero validar a consulta do cpf, se possui restrição",
  "id": "consultar-restrição-de-cpf",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 5,
      "name": "@executa"
    }
  ]
});
formatter.background({
  "line": 9,
  "name": "Acessar api",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que eu consulte a api get para consultar cpf",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Validar status code",
  "description": "",
  "id": "consultar-restrição-de-cpf;validar-status-code",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 13,
  "name": "Valido o status code de retorno",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 9,
  "name": "Acessar api",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que eu consulte a api get para consultar cpf",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Validar body response",
  "description": "",
  "id": "consultar-restrição-de-cpf;validar-body-response",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 16,
  "name": "Valido a mensagem de retorno \"O CPF 97093236014 tem problema\"",
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});