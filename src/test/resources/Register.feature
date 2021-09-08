
Feature: Register new User

  Scenario: User register in system
    Given Open register form
    Then Input first name
    Then user input last name
    Then user input email
    Then user input phone
    Then Input password
    Then Input password comfirm
    Then click on checkbox
    Then click on register button
    Then check on Your store page