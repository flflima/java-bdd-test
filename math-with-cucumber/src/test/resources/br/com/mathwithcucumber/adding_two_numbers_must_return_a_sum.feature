Feature: Adding two numbers must return a sum
  As addition operation in a calculator

  Scenario Outline: <first> plus <second> is equal to <result>
    Given a calculator
    When <first> is added to <second>
    Then must return the sum <result>

  Examples:
    | first  |  second  | result  |
    | 1      |  1       | 2       |
    | 10     |  10      | 20      |
    | -5     |  10      | 5       |
    | -5     |  -10     | -15     |