@Regression
Feature: Login functionality
  # here we would write the feature name to be tested
  # We create one feature file per feature(functionality)

  # Gherkin ---> Given when and then

  Background: User on Facebook
    Given Given User is logged in to https://www.facebook.com/


  Scenario: Verify user can login with valid credentials
    # Given steps are used for precondition
    # When Action
    When User enter test@test.com to email field
    # And
    And User should enter Hello1234 in password input field
    And User should click on Log In button
    # Then --> Validation
    Then User should successfully logged in to the Facebook

    Scenario: Verify user can login with invalid login and valid password
      When User enter test@test.com to email field
      And User should enter Hello1234 in password input field
      And User should click on Log In button
      Then User should successfully logged in to the Facebook