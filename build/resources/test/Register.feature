Feature: Register new User

  Scenario: Login user
    Given Open register form
    Then Input login
    Then Input password
    Then Click "Sign in" button span
    Then Content with "Welcome on board" visible