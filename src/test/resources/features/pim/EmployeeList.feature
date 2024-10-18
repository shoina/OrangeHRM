@search
Feature: Employee Search Feature
  Background:
    Given User is on the login page
    When User logs in with valid credentials
  Scenario: Search for an existing employee by name
    Given User is on the Employee List page
    When User enters "id" in the search input
    And User clicks on the search button
    Then User should see "id" in the search results


