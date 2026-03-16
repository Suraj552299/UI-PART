@US7
Feature: Login User with correct email and password

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable

    Scenario:
    Given User clicks on 'Test Cases' button
    Then verifies user is navigated to test cases page successfully