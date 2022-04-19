@regression
Feature: User could log in with valid data

  Background:
    Given the user is on the website page

  Scenario: user log in with valid email and password
    Given user navigates to login page
    When  user enter valid email and password
    And   user click enter
    Then  user logged successfully