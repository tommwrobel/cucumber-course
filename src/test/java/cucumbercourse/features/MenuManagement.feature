Feature: Menu Management

  Background: Prepare menu
    Given I have a menu object

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

  @RegularTest
  Scenario: Adding duplicate items
    Given I have a menu item with name "Cocumber Salad" and price 12
    And I add that menu item
    And I have a menu item with name "Cocumber Salad" and price 12
    When I add that menu item
    Then I get an error message "Menu item named Cocumber Salad already exists!"
