@US3
Feature: Login User with incorrect email and password
  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable
    Given User click Click and SignUp button
    Given User Verifies 'Login to your account' is visible
  @US3-1
    Scenario: User enters invalid email and password

      When User enters incorrect email address and password
      And User  clicks 'login' button
      Then User verifies error 'Your email or password is incorrect!' is visible
  @US3-2
  Scenario: User enters invalid email and valid password
  Given User enters wrong email and right password
    Then User clicks 'login' button
    Then User verifies error 'Your email or password is incorrect!' is visible

  @US3-3
  Scenario: User enters valid email and invalid password
    Given User enters right email and wrong password
    Then User clicks 'login' button
    Then User verifies error 'Your email or password is incorrect!' is visible
