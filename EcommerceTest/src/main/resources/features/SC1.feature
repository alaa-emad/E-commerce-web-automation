@regression
Feature: User could register with valid data

  Background:
    Given the user is on the website page

  Scenario: user register with valid data
    Given user navigates to register page
    When  user enter valid data
    And   user click register button
    Then  user registered successfully