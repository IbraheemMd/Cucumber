
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: To select Tariff plans
    Given The user must be in Telecom Homepage
    And the user should click on AddTariffPlans
    When The User should fill required details
    | MonthlyRental | 500 |
    | FreeLocalMinutes | 1000 |
    | FreeInternational Minutes |100|
    | FreeSMSPack | 500 |
    | LocalPerMinutesCharges  | 5 |
    | InternationalPerMinutesCharges | 50 |
    | SMSPerCharges | 1 |
    
    And The user should click on Submit
    Then the user see the confirmation message
    
