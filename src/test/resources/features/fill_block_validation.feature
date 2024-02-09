#Autor: Juan Diego Valencia Duque
# encoding: utf-8

@HistoriaDeUsuario
Feature: Diligenciar y validar Block Validation

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

    Given Deseo ingresar a Funcionalidad Block Validation
    When Doy click en el submenu Form Validation
    Then Verifico que se presenta pantalla de la funcionalidad con título Block Validation


  Scenario Outline: Realizar diligenciamiento y validacion de Block Validation
    Given Deseo realizar el diligenciamiento del formulario
    When Diligencio todo los campos del formulario
      | required   | email   | password   | cPassword   | date   | url   | digits   | range   |
      | <required> | <email> | <password> | <cPassword> | <date> | <url> | <digits> | <range> |
    And Presiono boton Validate
    Then Valido diligenciamiento exitoso

    Examples:
      | required   | email   | password   | cPassword   | date   | url   | digits   | range   |
    ##@externaldata@./src/test/resources/datadriven/Examples.xlsx@dataBlock
   |Colorlib challenge   |a@a.com   |demo45   |demo45   |45293   |https://colorlib.com/polygon/metis/login.html   |12356   |12|
