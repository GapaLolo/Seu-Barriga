$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "eu quero cadastrar um novo usuario no site",
  "description": "",
  "id": "eu-quero-cadastrar-um-novo-usuario-no-site",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "registrar um novo usuario com sucesso",
  "description": "",
  "id": "eu-quero-cadastrar-um-novo-usuario-no-site;registrar-um-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de login de usuario",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acesso com um usuario existente",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo a mensagem de sucesso de cadastro",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login_de_usuario()"
});
formatter.result({
  "duration": 939900600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_com_um_usuario_existente()"
});
formatter.result({
  "duration": 817253200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 11609579700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 328951300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.vejo_a_mensagem_de_sucesso_de_cadastro()"
});
formatter.result({
  "duration": 4866839900,
  "status": "passed"
});
});