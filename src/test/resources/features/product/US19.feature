@US19
Feature:View & Cart Brand Products

  Scenario: View & Cart Brand Products
  Given User clicks on 'Products' button
  And User verifies that Brands are visible on left side bar
  Then User clicks on any brand name
  And User verifies that user is navigated to brand page and brand products are displayed
  And User On left side bar, click on any other brand link
  Then User verifies that user is navigated to that brand page and can see products