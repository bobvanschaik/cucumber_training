Feature: Data Tables

  @S13
  Scenario: Add multiple items to the shopping cart
    Given I go to the webshop
    And I open the "All products" page
    When I add these products to my shopping cart:
      | Hummingbird printed t-shirt |
      | Mug The best is yet to come |
      | Mountain fox cushion        |
