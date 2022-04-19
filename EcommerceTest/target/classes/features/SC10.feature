@regression
Feature: Logged user can add items to wish list

  Background:
    Given the user is on the website page

  Scenario: Logged user could add different products to Wishlist
    Given user click on wishlist icon for item
    Then  item added to wishlist