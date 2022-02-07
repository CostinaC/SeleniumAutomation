Feature: Create a new account on www.gmail.com

  @T1
  Scenario: Create new gmail account
    Given I access the site www.gmail.com
    When I click on Creati un cont nou
    And I click on "Pentru mine"
    And I insert data in the text boxes
    Then I click "Inainte"
