
Feature: Ingresar al sitio web y descargar un pdf
  @regresion

  @caso1
  Scenario: Ingresar al sitio web y descargar un pdf
    Given El usuario quiere agregar un nuevo computador
    When  Seleccione la opción agregar nuevo computador
    And ingrese el nombre, fecha introduced, discontinued con el formato (AAAA,MM,DD) y compañía
    |nombre|fecha   |fecha1         |Compañia  |
    |pc1   |2022-03-21    |2021-03-21  |   RCA   |
    And de clic en el botón "Crear solicitud"
    Then  Sera direccionado al home y el nuevo PC quedara registrado
