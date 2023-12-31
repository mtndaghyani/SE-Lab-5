@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5  	    |
      | 2     | 2      | 4	    |

  Scenario: multiple two numbers
    Given Input values, 3 and 2
    When I multiple the values
    Then I expect the result 6

  Scenario: divide two numbers
    Given Input values, 16 and 4
    When I divide the values
    Then I expect the result 4

  Scenario: power two numbers
    Given Input values, 2 and 3
    When I power the values
    Then I expect the result 8

  Scenario Outline: opt two numbers
    Given Input values, <first> and <second> and <opt>
    Then I expect the <result>

    Examples:
      | first | second | opt | result |
      | 6 | 2 | * | 12 |
      | 6 | 2 | / | 3 |
      | 6 | 2 | ^ | 36 |