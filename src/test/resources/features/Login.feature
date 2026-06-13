Feature: Verifying GreensOMR login Module Run/Debug/Profile

  Scenario Outline: login with Valid Credentials
    Given User is on GreensOMR Page
    When User enters "<username>" and "<password>"
    And User clicks the login button
    Then User should verify welcome message after login

    Examples:
      | username                | password  |
      | designerryogi@gmail.com | Yog95465@ |


Scenario Outline: login with Valid Credentials
    Given User is on GreensOMR Page
    When User enters "<username>" and "<password>"
    And User clicks the login button
    Then User should verify welcome message after login

    Examples:
      | username                | password  |
      | designerryogi@gamail.com | Yog9f5465@ |
