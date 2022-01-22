Feature: return sum of all digits in a given number
  This feature should accept a number and return the sum of all the

  @test
  Scenario Outline: I should be able to get sum of all digits in a given number
    When the input is <number>
    Then the result is <result>
    Examples:
      | number | result |
      | 1205   | 8      |
      | -254   | 11     |
