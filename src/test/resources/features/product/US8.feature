@US8
Feature: Login User with correct email and password

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable

  Scenario:
  Given User clicks on 'Products' button
  And User Verifies user is navigated to ALL PRODUCTS page successfully
  Then User should see the products list is visible
  And User clicks on 'View Product' of first product
  When User is landed to product detail page
  Then User verifies that detail detail is visible: product name, category, price, availability, condition, brand