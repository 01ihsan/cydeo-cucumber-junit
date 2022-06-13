Feature: Library app login feature
  User Story:
  As a user, I should be able yo login with correct credentials to different accounts and dashboard should be displayed.

  Scenario: login as Librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard