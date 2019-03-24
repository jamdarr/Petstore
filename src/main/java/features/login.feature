Feature: Authentication

  Scenario: User successfully logging in
    Given the petstore home page
    When logging in as an admin
    Then the home page navigation is available