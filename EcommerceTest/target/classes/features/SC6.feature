@regression
Feature: Logged user can select categories

  Background:
    Given the user is on the website page

  Scenario: Logged user could select one Category
    Given user click on computer any category
    Then  selected category displayed