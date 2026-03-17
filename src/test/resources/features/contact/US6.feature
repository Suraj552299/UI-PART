@US6
Feature: Login User with correct email and password

  Background:  Given User is on the Home page
    Then User should see home page is visible and clickable
    Scenario:
  Given User clicks on 'Contact Us' button
  And User verifies 'GET IN TOUCH' is visible
  Then User enters name, email, subject and message
  Then User uploads file
  And User clicks 'Submit' button
  Then User clicks OK button
  And User verifies success message 'Success! Your details have been submitted successfully.' is visible
  Then User clicks 'Home' button and verify that landed to home page successfully