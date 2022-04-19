@regression
Feature: Logged user can switch between currencies

  Background:
    Given the user is on the website page

  Scenario: Logged User could switch between currencies US-Euro
    Given user click on currencies dropdown and select Euro
    Then  the currency changed successfully