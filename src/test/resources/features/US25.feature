@US23
Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable

    Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Given User scrolls down page to bottom
  And User verifies 'SUBSCRIPTION' is visible
  Then User clicks on arrow at bottom right side to move upward
  And User verifies that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen