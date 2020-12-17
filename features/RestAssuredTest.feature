Feature: Verify POST and GET operations on reqres.in using REST-Assured

  @Non-UI
  Scenario Outline: Verify Post registration
    Given I get perform POST operation for "/register"
    When I send a valid register paylod "<email>" and "<password>"
    Then response status code should be "<response>"


    Examples:
      | email              | password | response |
      | eve.holt@reqres.in | pistol   | 201      |
      | eve.holt@reqres.in |          | 400      |