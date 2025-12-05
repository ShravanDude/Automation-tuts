Feature: To check the login functionality working

  @Smoke
  Scenario: to validate the login page
    Given user is on the chrome browser
    And user is navigated to FleetNet login page
    When user enters username and password
    And user clicks on the login button
    Then user should navigated to home page
