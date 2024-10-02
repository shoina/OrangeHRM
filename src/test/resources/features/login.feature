Feature: Login feature

  @login
  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username
    And User enters valid password
    And User clicks on login button
    Then User should be able to login
