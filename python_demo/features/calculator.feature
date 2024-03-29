Feature: Calculator
    In order to avoid silly mistakes
    As a math idiot
    I want to be told the sum and the multiplication of two numbers

Scenario Outline: Add two numbers
    Given I have entered <number1> into the calculator
    And I have entered <number2> into the calculator
    When I press add
    Then the result should be <result> on the screen

    Examples:
    | number1 | number2 | result |
    | 50      | 70      | 120    |
    | 1080    | 20      | 1100   |
    | 3       | 2       | 5      |

Scenario Outline: Multiply two numbers
    Given I have entered <number1> into the calculator
    And I have entered <number2> into the calculator
    When I press multiply
    Then the result should be <result> on the screen

    Examples:
        | number1 | number2 |result |
        | 50      | 70      |3500   |
        | 1080    | 20      | 21600 |
        | 3       | 2       | 6     |
