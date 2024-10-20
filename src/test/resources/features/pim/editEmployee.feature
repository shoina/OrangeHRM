@edit
Feature: Edit Employee feature

  Background:
    Given User is on the login page
    When User logs in with valid credentials
  Scenario:
    Given  User is on the Employee List page
    When User clicks on the edit button for employee with ID "1234"
    And User is able to edit the employee's information
    And User is able to save the changes

