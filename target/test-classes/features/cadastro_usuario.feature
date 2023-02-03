# language: pt

@cadastro
Funcionalidade: eu quero cadastrar um novo usuario no site

  @cadastro-sucesso
  Cenario: registrar um novo usuario com sucesso
    Dado que estou na tela de login de usuario
    E acesso com um usuario existente
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Entao vejo a mensagem de sucesso de cadastro