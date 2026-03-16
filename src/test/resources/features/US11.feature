@US11
Feature: Verify Subscription in Cart page

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
    Scenario: User Verifies subscription in Cart page

Given User clicks 'Cart' button
And User scroll down to footer
Then User Verifies text 'SUBSCRIPTION'
And User Enter email address in input and click arrow button
      Then User Verifies success message 'You have been successfully subscribed!' is visible