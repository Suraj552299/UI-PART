@US16
Feature: Place Order: Login before Checkout

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
  Scenario: Place Order: Login before Checkout

Given User clicks 'Signup / Login' button
And User fills email, password and click 'Login' button
Then User verifies 'Logged in as username' at top
And User adds products to cart
Then clicks 'Cart' button
And User verifies that cart page is displayed
And User clicks Proceed To Checkout
Then User verifies Address Details and Review Your Order
And User enters description in comment text area and click 'Place Order'
And User enters payment details: Name on Card, Card Number, CVC, Expiration date
Then User clicks 'Pay and Confirm Order' button
And verifies success message 'Your order has been placed successfully!'
And User clicks 'Delete Account' button
Then User verifies 'ACCOUNT DELETED!' and click 'Continue' button