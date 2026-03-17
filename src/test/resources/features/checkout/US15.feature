@US15
Feature: Place Order: Register before Checkout

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
    Scenario: Place Order: Register before Checkout

    Given User clicks 'Signup / Login' button
    And User fills all details in Signup and create account
    And User verifies 'ACCOUNT CREATED!' and click 'Continue' button
    Then User verifies ' Logged in as username' at top
    And User adds products to cart
    And User clicks 'Cart' button
    Then User verifies that cart page is displayed
    And User clicks Proceed To Checkout
    And User verifies Address Details and Review Your Order
    Then User enters description in comment text area and click 'Place Order'
    And User enters payment details: Name on Card, Card Number, CVC, Expiration date
    Then User clicks 'Pay and Confirm Order' button
    And User verifies success message 'Your order has been placed successfully!'
    Then User clicks 'Delete Account' button
    And User verifies 'ACCOUNT DELETED!' and click 'Continue' button