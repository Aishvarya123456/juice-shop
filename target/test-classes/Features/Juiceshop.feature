@all
Feature: Online Shopping Checkout Process

@ui
  Scenario: User adds an item to basket and completes the checkout process
    Given the user is on the online shopping website
    When the user adds the "Apple Juice" item to the basket
    And the user proceeds to checkout
    When the user enters the shipping address
      | Field          | Value       |
      | Name           | Aishvarya   |
      | Street Address | 31 Abirami nagar |
      |Phone					 | 9999999999|
      |Country         | India     |
      | City           | Chennai     |
      | State          | TamilNadu   |
      | ZIP Code       | 600045       |
    And the user submits the shipping address
    Then the user should see delivery speed options
    And the user enters the payment details
      | Field           | Value           |
      | Cardholder Name | Aishvarya       |
      | Card Number     | 9876543210988765|
      | Expiry Month    | 3             |
      | Expiry Year     | 2080            |
      
     @api 
  Scenario: To validate the api for add a unique card details
  Given Add the base uri
  When call the GET method with card details api to get added card details  
  Then Verify the card details added is the payment options  
   