# language: pt

@cadastro
Funcionalidade: eu quero cadastrar um novo usuario no site

  @cadastro-sucesso-chrome
  Cenario: registrar um novo usuario com sucesso
    Dado que estou na tela de login de usuario no <"CHROME">
    E acesso com um usuario existente
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Entao vejo a mensagem de sucesso de cadastro

  @cadastro-sucesso-firefox
  Cenario: registrar um novo usuario com sucesso
    Dado que estou na tela de login de usuario no <"FIREFOX">
    E acesso com um usuario existente
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Entao vejo a mensagem de sucesso de cadastro

  @cadastro-sucesso-edge
  Cenario: registrar um novo usuario com sucesso
    Dado que estou na tela de login de usuario no <"EDGE">
    E acesso com um usuario existente
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Entao vejo a mensagem de sucesso de cadastro