Feature: Test the login functionality

  Scenario: Test the valid login
    Given user is on loginPage
    When user enters credentails
    And click on login button
    Then user should land on home page