@US5
Feature:Register User with existing email
  Background:
    Given User is on the Home page
    Then User should see home page is visible and clickable
    Given User click Click and SignUp button

    Scenario:Register User with existing email
      Given User verifies 'New User Signup!' is visible
      When User enters name and already registered email address
      And Click 'Signup' button
      Then verifies error 'Email Address already exist!' is visible