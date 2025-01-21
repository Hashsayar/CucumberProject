Feature: logging in an employee

  Scenario: Employee login with empty cridentials

    Given user navigates the HRMs application
    When user does not enter valid user name
    And user does not enter valid password
    And user clicks on login button
    Then user sees an error massage