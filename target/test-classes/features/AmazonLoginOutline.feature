Feature: Amazon: outline demo

  Scenario Outline: Multiple tests
    Given I'm on Amazon
    Given I'm on Amazon registration
    When I'm enter "<email>"
    And I'm must click continue
    Then I'm should see "<message>"
    Examples:
      | email            | message         |
      | aziret@gmail.com | Successful      |
      | azamat@yandex.ru | Successful      |
      | hayat@mail.ru    | Email not found |