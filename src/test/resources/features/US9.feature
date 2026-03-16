@US9
Feature: Login User with correct email and password

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable

  Scenario:
  Given User clicks on 'Products' button
  And User verifies user is navigated to ALL PRODUCTS page successfully
  Then User enters product name in search input and click search button
  And User verifies 'SEARCHED PRODUCTS' is visible
  Then User verifies all the products related to search are visible