Feature: Register new User

  Scenario: User register in system
    Given Open register form
    Then Input first name
    Then user input last name
    Then user input email
    Then Input password
    Then Input password comfirm
    Then Click "Sign in" button span
    Then Content with "Welcome on board" visible