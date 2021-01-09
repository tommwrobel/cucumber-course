Feature: Menu Management

  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add second menu item
    Given I have a menu item with name "Cucumber Salad" and price 15
    When I add that menu item
    Then Menu item with name "Cucumber Salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: Add third menu item
    Given I have a menu item with name "Chicken Soup" and price 10
    When I add that menu item
    Then Menu item with name "Chicken Soup" should be added