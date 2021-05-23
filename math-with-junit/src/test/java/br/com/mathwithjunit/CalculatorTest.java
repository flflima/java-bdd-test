package br.com.mathwithjunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Given a calculator when an add operation is executed then 1 plus 1 is equal to 2")
    void givenACalculatorWhenAnAddOperationIsExecutedThen1Plus1IsEqualTo2() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(1, 1);

        // assert
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Given a calculator when an add operation is executed then 21 plus 5 is equal to 26")
    void givenACalculatorWhenAnAddOperationIsExecutedThen21Plus5IsEqualTo26() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(21, 5);

        // assert
        assertEquals(26, result);
    }

    @Test
    @DisplayName("Given a calculator when an add operation is executed then -10 plus 10 is equal to 0")
    void givenACalculatorWhenAnAddOperationIsExecutedThenNegative10Plus10IsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(-10, 10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when an add operation is executed then -13 plus -15 is equal to -28")
    void givenACalculatorWhenAnAddOperationIsExecutedThenNegative13PlusNegative15IsEqualToNegative28() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(-13, -15);

        // assert
        assertEquals(-28, result);
    }

    @Test
    @DisplayName("Given a calculator when a subtract operation is executed then 1 minus 2 is equal to -1")
    void givenACalculatorWhenASubtractOperationIsExecutedThen1Minus2IsEqualToNegative1() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(1, 2);

        // assert
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Given a calculator when a subtract operation is executed then 10 minus 10 is equal to 0")
    void givenACalculatorWhenASubtractOperationIsExecutedThen10Minus10IsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(10, 10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when a subtract operation is executed then -10 minus -10 is equal to 0")
    void givenACalculatorWhenASubtractOperationIsExecutedThenNegative10MinusNegative10IsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(-10, -10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when a subtract operation is executed then -15 minus 15 is equal to -30")
    void givenACalculatorWhenASubtractOperationIsExecutedThenNegative15Minus15IsEqualToNegative30() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(-15, 15);

        // assert
        assertEquals(-30, result);
    }

}
