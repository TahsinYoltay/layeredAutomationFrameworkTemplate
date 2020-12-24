Feature: Home Page Login Test

  @UI
  Scenario Outline: Verify Login Functionality
    Given I am on the automationpractice.com "homePage"
    And I navigate to Sing in Page
    And I fill username with "<email>"
    And I fill password with "<password>"
    And I click Sign in button
    Then I should see the correct "<message>"


    Examples:
      | email             | password | message                    |
      |                   |          | An email address required. |
      | tyoltay@gmail.com |          | Password is required.      |
      |                   | 22784539 | An email address required. |
      | tyoltay@gmail.com | 123456   | Authentication failed.     |
