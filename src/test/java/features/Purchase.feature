@purchase
Feature: Purchase


  Background:
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @purchase-1
  Scenario: Success backpack purchase
    When I push add to cart button of backpack
    And click on cart icon
    When I push the Checkout button
    And enter "John" to first name
    And enter "Black" to last name
    And enter "12345" to ZIP code
    When I click on Continue button
    And push Finish button
    Then header with text "Thank you for your order!" is displayed
    And secondary header with text "Checkout: Complete!" is displayed
    And url contains "checkout-complete"





