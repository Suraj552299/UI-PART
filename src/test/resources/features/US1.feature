@US1
  Feature: User should able to see Automation exercise page
    Background: User is already on the Home page
      Given User is on the Home page
      Then User should see home page is visible and clickable
      Given User click Click and SignUp button
      Then User should see registration page is visible
      When User enters userName,gmail adress information
      And User click SignUp button



    @US1-1
    Scenario: User fill in her or his information on the registration page
      Given User enters valid information to create account



