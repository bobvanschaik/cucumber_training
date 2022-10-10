Feature: Regular expressions

  @S08
  Scenario: Limit user options
    Given I login as user Henk
    When I set my country code to NL
    And I change my cellphone number to 0612345678