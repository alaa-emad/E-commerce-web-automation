@regression
Feature: Logged user can filter results

  Background:
    Given the user is on the website page

  Scenario: Logged user could filter with color
    Given user select shoes item
    When  user click on red color
    Then  shoes filtered by selected color