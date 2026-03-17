@US13
Feature: Verify Product quantity in Cart

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable

  Scenario: User Verify Product quantity in Cart1

    Given User Click 'View Product' for any product on home page
  And User Verify product detail is opened
  Then User Increase quantity to 4
  And User Clicks 'Add to cart' button
  And User Clicks 'View Cart' button
  Then User Verify that product is displayed in cart page with exact quantity