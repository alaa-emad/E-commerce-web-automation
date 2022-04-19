@regression
Feature: Logged user can select tag

  Background:
    Given the user is on the website page

  Scenario: Logged user could select tag
    Given user click on different tags
    Then  the items filtered by selected tags