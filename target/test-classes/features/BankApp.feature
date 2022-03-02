Feature: Bank App
  Scenario: Account for user
    Given user should register to bank with following data
      | Account Number | Routing Number |
      | 123123123123   | 345345345      |
    Then user should be successfully registered the bank with following data
      | Account Number | Routing Number |
      | 123123123123   | 345345345      |