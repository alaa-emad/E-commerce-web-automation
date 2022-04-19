@regression
Feature:  Logged User could search for any product

  Background:
    Given the user is on the website page

  Scenario: Logged User could search for any product
    Given user click on search box and enter the name of product then enter
    Then  the process success