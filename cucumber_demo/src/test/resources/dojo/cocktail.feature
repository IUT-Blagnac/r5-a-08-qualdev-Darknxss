Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).

  Scenario Outline: Creating an order
    Given "<from>" who wants to buy <nb> cocktails
    When  an order is declared for "<to>"
    And a message saying "<message>" is added
    Then  there is <nb> cocktail in the order

  Examples:
  | from       | to      | message  | nb |
  | Paul       | Tristan | message1 | 3  |
  | Nicolas    | Paul    | message2 | 2  |
  | Tristan    | Nicolas | message3 | 6  |