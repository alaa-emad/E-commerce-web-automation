@regression
Feature: Logged user can add items to compare list

  Background:
    Given the user is on the website page

  Scenario:  Logged user could add different products to compare list
    Given user click on compare list icon for item
    Then  item added to compare list
