@US14
Feature: Place Order: Register while Checkout

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable

    Scenario: Place Order: Register while Checkout
    Given User adds products to cart
    And User clicks 'Cart' button
    And User verifies that cart page is displayed
    Then User clicks Proceed To Checkout
    And User clicks 'Register / Login' button
    And User fills all details in Signup and create account
    Then User verifies 'ACCOUNT CREATED!' and click 'Continue' button
    When User verifies ' Logged in as username' at top
    And User clicks 'Cart' button
    And User clicks 'Proceed To Checkout' button
    Then User verifies Address Details and Review Your Order
    Then User enters description in comment text area and click 'Place Order'
    And User clicks 'Pay and Confirm Order' button
    And User enters payment details: Name on Card, Card Number, CVC, Expiration date
    And User clicks 'Pay and Confirm Order' button
    Then User verifies success message 'Your order has been placed successfully!'
    And User clicks 'Delete Account' button
    Then User verifies 'ACCOUNT DELETED!' and click 'Continue' button
