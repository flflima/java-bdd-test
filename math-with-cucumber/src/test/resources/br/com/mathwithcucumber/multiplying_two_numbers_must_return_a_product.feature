Feature: Multiplying two numbers must return a product
  A multiplication operation in a calculator

  Scenario Outline: <first> multiplied by <second> is equal to <result>
    Given a calculator
    When <first> is multiplied by <second>
    Then must return a product equals to <result>

  Examples:
    | first  |  second  | result  |
    | 1      |  0       | 0       |
    | 20     |  1       | 20      |
    | -5     |  10      | -50     |
    | -5     |  -10     | 50      |