package br.com.mathwithspock

import spock.lang.Specification
import spock.lang.Unroll

class CalculatorTest extends Specification {

    @Unroll("Adding #first to #second must returns a sum equals to #result")
    def "Adding two numbers must return a sum"() {
        given: "a Calculator"
        def calculator = new Calculator()

        when: "an add operation is executed"
        def sum = calculator.add(first, second)

        then: "'first' plus 'second' is 'result'"
        sum == result

        where:
        first   |   second  |   result
        1       |   2       |   3
        21      |   5       |   26
        -10     |   10      |   0
        -13     |   -15     |   -28
    }

    @Unroll("Subtracting #first to #second must returns a difference equals to #result")
    def "Subtracting two numbers must return a difference"() {
        given: "a Calculator"
        def calculator = new Calculator()

        when: "a subtract operation is executed"
        def diff = calculator.minus(first, second)

        then: "'first' minus 'second' is 'result'"
        diff == result

        where:
        first   |   second  |   result
        1       |   2       |   -1
        10      |   10      |   0
        -10     |   -10     |   0
        -15     |   15      |   -30
    }

    @Unroll("Multiplying #first to #second must returns a product equals to #result")
    def "Multiplying two numbers must return a product"() {
        given: "a Calculator"
        def calculator = new Calculator()

        when: "a multiplication operation is executed"
        def product = calculator.multiply(first, second)

        then: "'first' multiplied by 'second' is 'result'"
        product == result

        where:
        first   |   second  |   result
        1       |   0       |   0
        1       |   10      |   10
        -10     |   10      |   -100
        -10     |   -15     |   150
    }

    @Unroll("Dividing #first by #second must returns a quotient equals to #result")
    def "Dividing two numbers must return a quotient"() {
        given: "a Calculator"
        def calculator = new Calculator()

        when: "a division operation is executed"
        def quotient = calculator.divide(first, second)

        then: "'first' divided by 'second' is 'result'"
        quotient == result

        where:
        first   |   second  |   result
        90      |   2       |   45
        1       |   10      |   0.1
        -10     |   10      |   -1
        -15     |   -10     |   1.5
    }

    def "Dividing by zero must returns an exception"() {
        given: "a Calculator"
        def calculator = new Calculator()

        and: "a divisor equals to zero"
        def divisor = 0

        when: "10 is divided by zero"
        calculator.divide(10, divisor)

        then: "an exception is expected"
        def exception = thrown(IllegalArgumentException)
        exception.message == "Divisor is equal to zero!"
    }

    def "Executing a complex operation, must return the correct result"() {
        given: "a calculator"
        def calculator = new Calculator()

        when: "adding 2 to 20"
        def result = calculator.add(2, 20)

        and: "multiplying by 5"
        result = calculator.multiply(result, 5)

        and: "dividing by 10"
        result = calculator.divide(result, 10)

        then: "the result must be 11"
        result == 11
    }
    
}
