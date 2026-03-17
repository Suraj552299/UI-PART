@US21
Feature:Add review on product
  Scenario: Add review on product
  Given User clicks on 'Products' button
  And User verifies user is navigated to ALL PRODUCTS page successfully
  And User clicks on 'View Product' button
  Then User verifies 'Write Your Review' is visible
  And User enters name, email and review
  And User clicks 'Submit' button
  Then User  verifies success message 'Thank you for your review.'