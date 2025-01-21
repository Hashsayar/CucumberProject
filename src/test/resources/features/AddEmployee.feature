Feature: Add employee by two methods

  Scenario: Adding employee by firstname middlename and lastname
   Given user navigates the HRMs application
   When user enters valid login username and password
   And user clicks on login button
  When user clicks on PIM option
  And user clicks on Add Employee button
   And user enters firstName middleName and lastName of the Employee
   And user clicks on save button
    Then user is able to successfully add the Employee