@US17
Feature:Remove Products From Cart

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
  Scenario:Remove Products From Cart
  Given User adds products to cart
  And User clicks 'Cart' button
  Then User verifies that cart page is displayed
  And User clicks 'X' button corresponding to particular product
  Then User verifies that product is removed from the cart