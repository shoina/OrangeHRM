Feature: Login feature

  @login
  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User logs in with valid credentials
    Then User should be able to login
