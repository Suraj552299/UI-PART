@US23
Feature: Verify address details in checkout page

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable

    Scenario: Verify address details in checkout page

    Given User clicks 'Signup / Login' button
    And User fills all details in Signup and create account
    And User verifies 'ACCOUNT CREATED!' and click 'Continue' button
    Then User verifies ' Logged in as username' at top
    And User adds  products to cart
    And User clicks  'Cart' button
    Then User  verifies that cart page is displayed
    And User clicks  Proceed To Checkout
    And User verifies that the delivery address is same address filled at the time registration of account
    Then User verifies that the billing address is same address filled at the time registration of account
    And User clicks 'Delete Account' button
    Then User verifies  'ACCOUNT DELETED!' and click 'Continue' button