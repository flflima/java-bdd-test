Feature: Subtracting two numbers must return a difference
  A subtraction operation in a calculator

  Scenario Outline: <first> minus <second> is equal to <result>
    Given a calculator
    When <first> is subtracted from <second>
    Then must return the difference <result>

  Examples:
    | first  |  second  | result  |
    | 1      |  1       | 0       |
    | 20     |  2       | 18      |
    | -5     |  10      | -15     |
    | -5     |  -10     | 5       |