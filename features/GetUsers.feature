Feature: Check User List

  @Non-UI
  Scenario: When I get users, I verify user with response code 200
    Given : I get perform GET operation for "/users"
    When I get user list
    Then I verify response code "200"