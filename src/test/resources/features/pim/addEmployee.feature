@addEmployee
Feature: Add Employee feature
  Background:
    Given User is on the login page
    When User logs in with valid credentials
  Scenario:
    Given User is on add employee page
    When User enters valid firstname
    And User enters valid middlename
    And User enters valid lastname
    And User enters valid id
    And User clicks on save button
    Then User should be saved
