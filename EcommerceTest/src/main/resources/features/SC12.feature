@regression
Feature: Logged user can complete the order

  Background:
    Given the user is on the website page

  Scenario: Create successful Order
    Given user login with valid data
    And   user add item to cart
    When  user press continue and complete the process
    Then  order completed successfully