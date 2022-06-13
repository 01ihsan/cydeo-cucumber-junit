@LibraryLogin @Regression
Feature: Library app login feature
  User Story:
  As a user, I should be able yo login with correct credentials to different accounts and dashboard should be displayed.

  @Librarian
  Scenario: login as Librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @Student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @Admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard