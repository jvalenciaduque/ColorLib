#Autor: Juan Diego Valencia Duque
# encoding: utf-8

@HistoriaDeUsuario
Feature: Realizar logueo en Colorlib.com

  Background:
  Scenario Outline: Realizar logueo exitoso
    Given Deseo realizar logueo en el aplicativo colorlib
    When Ingreso credenciales con <user> y <password>
    And Presiono boton SignIn
    Then Valido logueo exitoso con label en home

    Examples:
      | user | password |
    ##@externaldata@./src/test/resources/datadriven/Examples.xlsx@data
      | demo | demo     |

  Scenario: Realizar validacion de Block Validation
      Given Deseo ingresar a Funcionalidad Block Validation
      When Doy click en el submenu Form Validation
      Then Verifico que se presenta pantalla de la funcionalidad con título Block Validation
