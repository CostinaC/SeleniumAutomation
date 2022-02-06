Feature: Search street on: https://www.openstreetmap.org/
@T3
  Scenario: Search an address and press "Go"
    Given I open the site
    When I insert data in the text search
    And I click on the go button
    Then I should have  results return

  @T4
  Scenario: Calculate distance between addresses
    Given I open the site
    When I click on direction button
    And I insert address in the text boxes
    Then I click on the go route

