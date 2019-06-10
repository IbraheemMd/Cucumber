@regression
Feature: Title of your features
  I want to use this template for my feature file

@us1
  Scenario: Test the  customer Id generated1
    Given the user navigates into the Addcustomer page
    And the user click on Addcustomer
    When the user has to fill the valid details
    | Test | Selenium | 123@gmail.com | chennai | 123644 |
    And the user has to click submit button
    Then the user see the customer Id generated

@us2
Scenario: Test the  customer Id generated2
    Given the user navigates into the Addcustomer page
    And the user click on Addcustomer
    When the user has to fill the valid details
    | Test | Selenium | 123@gmail.com | chennai | 123456 |
    And the user has to click submit button
    Then the user see the customer Id generated
    
 @us3    
    Scenario: Test the  customer Id generated3
    Given the user navigates into the Addcustomer page
    And the user click on Addcustomer
    When the user has to fill the valid details
    | Test | Selenium | 123@gmail.com | chennai | 123456 |
    And the user has to click submit button
    Then the user see the customer Id generated
    
