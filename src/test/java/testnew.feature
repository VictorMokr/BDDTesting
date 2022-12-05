Feature: My Cucumber test of Ebay and Amazon

  Scenario: Find computer monitor
    Given I go to Ebay
    When I find input fields
    And I write Computer monitor
    Then I check results

  Scenario: Create account
    Given I go to Amazon
    When I go to Create account
    And I fill form Your name
    And I fill form Email
    And I fill form Password
    And I fill form re-Password
    When I click button Continue
    Then I see approval of registration

  Scenario: Find a Gift list
    Given I go to Gift Card Page
    When I click to Find Gift
    And I try to find Gift Card
    Then I see result

  Scenario: Quit from Ebay
    Given  I go to Homepage
    When I check Daily Deals
    Then Quit from Ebay