@delete
Feature: Delete Employee
  Background:
    Given User is on the login page
    When User logs in with valid credentials

  Scenario:
    Given  User is on the Employee List page
    When User clicks on the delete button for employee with ID "0292"
    Then User is able to see confirmation message with text "Successfully Deleted"
