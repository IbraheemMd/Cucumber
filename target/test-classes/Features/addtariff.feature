@tag
Feature: To test the Addtariffplan
  I want to use this template for my feature file

  @tag2
  Scenario Outline: To verify the congrats message comes to user
    Given The user should be in home page
    And The user should click on Addtariffplan
    When The user should give valid details"<MonthlyRental>","<freelocmin>","<freeintmin>","<freesms>","<locmincharges>","<intmincharge>","<smscharge>"
    And The user should click on the submit button
    Then The user can see the congrats message

    Examples: 
      | MonthlyRental | freelocmin | freeintmin | freesms | locmincharges | intmincharge | smscharge |
      |           400 |        200 |         50 |     100 |             2 |           10 |         1 |
      |           500 |        300 |         70 |     100 |             2 |            8 |         1 |
      |           700 |        500 |        100 |     100 |             1 |            5 |         1 |
