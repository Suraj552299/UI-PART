@US18
Feature:View Category Products
  Scenario: View Category Products
  Given User verifies that categories are visible on left side bar
  And User clicks on 'Women' category
  Then User clicks on any category link under 'Women' category, for example: Dress
  And User verifies that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
  And User On left side bar, click on any sub-category link of 'Men' category
  Then User verifies that user is navigated to that category page