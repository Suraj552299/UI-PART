@US12
Feature: Add Products in Cart

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable

  Scenario: User Adds Products in Cart

  Given User Click 'Products' button
  And User Hover over first product and click 'Add to cart'
  Then User Click 'Continue Shopping' button
  And User Hover over second product and click 'Add to cart'
  And User Click 'View Cart' button
  And User Verify both products are added to Cart
  Then User Verify their prices, quantity and total price