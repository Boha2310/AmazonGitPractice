@Regression
Feature: Data Table practice

  Scenario: Order Kimchi from Arigato
    Given User is on NambaFood
    When User clicks on Foods
    Then User should see "250 лучших заведений города на любой вкус"
    And User should find Sushi category
    When User click on Sushi
    Then User should see list of cafes
    And User should scrool down the page to Arigato cafe
    When User click on Arigato
    Then User should see Arigato menu
    Then User should find Kimchi
    When User increase Kimchi amount to 3
    And User should click on Order button
    Then on the cart user shouls see "450$"




    Scenario: Verify following tabs are displayed in Amazon
      Given User is on "https://www.amazon.com/"
      Then Following menu bar should be displayed on Home page
        | All  | Today's Deal | Customer Service | Registry | Gift Cards | Sell   |
        | Helo | Dog          | Service          | Cow      | Summer     | Winter |
        | User | Deal         | Java             | Audi     | Cards      | Sell   |