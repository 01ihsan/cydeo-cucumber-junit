@Login @Regression
Feature: Library app login feature
  User Story:
  As a user,
  I should be able yo login with correct credentials to different accounts and dashboard should be displayed.
  Accounts: Librarian, Student and Admin

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the library log in page
#this is how we write comments

  @librarian @employee
  Scenario: login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard