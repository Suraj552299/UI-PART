@US2
Feature: Login User with correct email and password
  Background:  Given User is on the Home page
               Then User should see home page is visible and clickable
    Given User click Click and SignUp button
    Then User should see registration page is visible

    Scenario: User login valid email and password

      Given User should see 'Login to your account' is visible
      Then  Enter correct email address and password
      Then Click 'login' button
      And User Verifies that 'Logged in as username' is visible
      Then User clicks 'Delete Account' button
      Then Verify that 'ACCOUNT DELETED!' is visible