#Author: bliteti.armando@unidas.com.br

@tag
Feature: Validar cadastros
Como usuario quero validar cadastros no site
 

  @tag1
  Scenario: Validar cadastro de categoria
    Given que eu esteja no site "https://portal.dev.unidas.com.br/login"
    When digito email "teste@pesados.unidas.com.br"
    And digito senha "Un1d@s#2022"
    And clico em cadatros
    And clico em categorias
    And clico em incluir categoria
    And preencho todos os campos
    And clico em salvar
    Then categoria cadastrada com sucesso

 