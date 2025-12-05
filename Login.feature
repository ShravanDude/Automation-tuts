Feature: ATS application login feature

  Scenario: 
    Given user is on the browser
    And user is navigated to login page
    When user enter username and password
    And click on the submit button
    Then user navigated to home page

  @Regression
  Scenario Outline: Validate the login functionality of ATS application
    Given user is on the browser
    And user is navigated to login page
    When user enter <username> and <password>
    And click on the submit button
    Then user navigated to home page.

    Examples: 
      | username        | password    |
      | "SHRAVAN_CSR"   | "Test1234#" |
      | "SHRAVAN_HCSR"  | "Test123#"  |
      | "SHRAVAN.ADMIN" | "Test1234#" |
