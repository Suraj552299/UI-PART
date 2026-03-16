@US22
Feature:Add to cart from Recommended items
  Scenario: Add to cart from Recommended items

  Given User scrolls to bottom of page
  And User verifies 'RECOMMENDED ITEMS' are visible
  Then User clicks on 'Add To Cart' on Recommended product
  And User clicks on 'View Cart' button
  Then User verifies that product is displayed in cart page