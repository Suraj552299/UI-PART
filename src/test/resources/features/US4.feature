@US4
Feature: User should Logout as he or she thought

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable
    Given User click Click and SignUp button
    Given User Verifies 'Login to your account' is visible

    Scenario:
      Given  User enters correct email address and password
      And User clicks 'login' button
      Then User verifies that 'Logged in as username' is visible
      And  User clicks 'Logout' button
      Then User verifies that user is navigated to login page