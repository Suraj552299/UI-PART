@US20
Feature:Search Products and Verify Cart After Login
  Scenario: Search Products and Verify Cart After Login
  Given User clicks on 'Products' button
  And User verifies user is navigated to ALL PRODUCTS page successfully
  Then User enters product name in search input and click search button
  And User verifies 'SEARCHED PRODUCTS' is visible
  And User verifies all the products related to search are visible
  And User adds those products to cart
  Then User clicks 'Cart' button and verify that products are visible in cart
  And User clicks 'Signup / Login' button and submit login details
  And User Again, goes to Cart page
  Then User verifies that those products are visible in cart after login as well