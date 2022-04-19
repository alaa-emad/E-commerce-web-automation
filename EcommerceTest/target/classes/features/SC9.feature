@regression
Feature: Logged user can add product to shopping cart

  Background:
    Given the user is on the website page

  Scenario: Logged user could add different products to Shopping cart
    Given user click on add to shopping card icon
    Then  the item added to cart