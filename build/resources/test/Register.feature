
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
    Then check message after update profile
    Then open home page
    Then choose Mac in desktop category
    Then add Mac to cart
    Then check success message for category page
    Then open cart
    Then check product name in cart
    Then check product quantity
    Then click on Checkout
    Then fill name on billing form
    Then fill lastname
    Then fill address
    Then fill city
    Then fill postcode
