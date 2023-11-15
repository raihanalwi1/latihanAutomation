Feature: Login Account
  As a user
  I want to login
  So i can access account

  Scenario: Login success
    Given I am on the login page
    Then I input username
    And I input password
    And I click button login
    When I will go to the dashboard page





