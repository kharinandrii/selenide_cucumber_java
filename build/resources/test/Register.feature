
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
    Then click on Continue button
    Then check on Your store page
    Then open edit profile form
    Then check First Name in Edit form
    Then check Last Name in Edit form
    Then check Email in Edit form
    Then check Phone in Edit form
    Then click on Continue button