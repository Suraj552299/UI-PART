@US23
Feature: Download Invoice after purchase order

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
    Scenario: Download Invoice after purchase order
  Given User adds   products to cart
  And User clicks 'Cart' button
  And User verifies  that cart page is displayed
  And User clicks Proceed To Checkout
  Then User clicks 'Register / Login' button
  And User fills all details in Signup and create account
  Then User verifies 'ACCOUNT CREATED!' and click 'Continue' button
  And User verifies ' Logged in as username' at top
  And User clicks 'Cart' button
  Then User clicks 'Proceed To Checkout' button
  And User  verifies Address Details and Review Your Order
  And User enters description in comment text area and click 'Place Order'
  Then User enters payment details: Name on Card, Card Number, CVC, Expiration date
  And User clicks 'Pay and Confirm Order' button
  Then User verifies success message 'Your order has been placed successfully!'
  And User clicks 'Download Invoice' button and verify invoice is downloaded successfully.
  And User Clicks 'Continue' button
  And User clicks 'Delete Account' button
  Then User verifies 'ACCOUNT DELETED!' and click 'Continue' button