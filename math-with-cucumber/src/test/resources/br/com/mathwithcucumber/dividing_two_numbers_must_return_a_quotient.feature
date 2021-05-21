Feature: Dividing two numbers must return a quotient
  A division operation in a calculator

  Scenario Outline: <first> divided by <second> is equal to <result>
    Given a calculator
    When <first> is divided by <second>
    Then must return a quotient equals to <result>

  Examples:
    | first  |  second  | result  |
    | 10     |  1       | 10      |
    | 20     |  10      | 2       |
    | -50    |  10      | -5      |
    | -5     |  -10     | 0.5     |

  Scenario: Any number that is divided by zero must return an error
    Given a calculator
    When 10 is divided by zero
    Then must return an error with the message "Divisor is equal to zero!"