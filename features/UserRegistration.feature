Feature: Verify POST and GET operations on reqres.in using REST-Assured

  @Non-UI
  Scenario Outline: Verify Post registration
    Given I creted valid register payload "<email>" and "<password>"
    When I get perform POST operation for "/register"
    Then response status code should be "<response>"


    Examples:
      | email              | password | response |
      | eve.holt@reqres.in | pistol   | 200      |
      | eve.holt@reqres.in |          | 400      |