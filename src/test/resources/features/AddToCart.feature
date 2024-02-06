Feature: Add to product into cart and proceed for checkout.

  Scenario: Perform actions on Amazon home page
    Given I open Amazon website
    When I click on Mobile on top right
    Then I scroll down and click on iphone 13 under Bestselling premium smartphones
    And I scroll down and click on add to cart button in the left side
    And I click on Cart button under Added to Cart popup in the left side
    Then I click on proceed to buy button in the left side
