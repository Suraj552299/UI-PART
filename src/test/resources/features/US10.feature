@US10
Feature: Verify Subscription in home page

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable

         Scenario: Verify Subscription in home page
    Given User scrolls down to footer
    And User verifies text 'SUBSCRIPTION'
    Then User enters email address in input and click arrow button
    Then Verifies success message 'You have been successfully subscribed!' is visible