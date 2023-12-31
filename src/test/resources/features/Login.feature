Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  @librarian
  Scenario: Login as librarian
    When user enter librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enter student username
    And user enters student password
    Then user should see the dashboard

  @admin
  Scenario: Login as admin
    When user enter admin username
    And user enters admin password
    Then user should see the dashboard