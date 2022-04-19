@regression
Feature: User could reset password

  Background:
    Given the user is on the website page

  Scenario: user reset his/her password successfully
    Given user logout and navigates to login page
    When  user click on reset button
    And   user enter correct email and lick enter
    Then  password rest link sent successfully