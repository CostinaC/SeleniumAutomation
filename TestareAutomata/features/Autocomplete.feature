Feature: Autocomplete form
@T1
  Scenario: Fill in the address field
    Given I am on herokuapp.com
    When I insert some text in the autocomplete field
    Then I can consider my test passed