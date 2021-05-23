package br.com.mathwithjunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Given a calculator when 1 is added by 1 then the sum is equal to 2")
    void givenACalculatorWhen1IsAddedBy1ThenTheSumIsEqualTo2() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(1, 1);

        // assert
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Given a calculator when 21 is added by 5 then the sum is equal to 26")
    void givenACalculatorWhen21IsAddedBy5ThenTheSumIsEqualTo26() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(21, 5);

        // assert
        assertEquals(26, result);
    }

    @Test
    @DisplayName("Given a calculator when -10 is added by 10 then the sum is equal to 0")
    void givenACalculatorWhenNegative10IsAddedBy10ThenTheSumIsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(-10, 10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when -13 is added by -15 then the sum is equal to -28")
    void givenACalculatorWhenNegative13IsAddedByNegative15ThenTheSumIsEqualToNegative28() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.add(-13, -15);

        // assert
        assertEquals(-28, result);
    }

    @Test
    @DisplayName("Given a calculator when 1 is subtracted by 2 then the difference is equal to -1")
    void givenACalculatorWhen1IsSubtractedBy2ThenTheDifferenceIsEqualToNegative1() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(1, 2);

        // assert
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Given a calculator when 10 is subtracted by 10 then the difference is equal to 0")
    void givenACalculatorWhen10IsSubtractedBy10ThenTheDifferenceIsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(10, 10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when -10 is subtracted by -10 then the difference is equal to 0")
    void givenACalculatorWhenNegative10IsSubtractedByNegative10ThenTheDifferenceIsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(-10, -10);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when -15 is subtracted by 15 then the difference is equal to -30")
    void givenACalculatorWhenNegative15IsSubtractedBy15ThenTheDifferenceIsEqualToNegative30() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.subtract(-15, 15);

        // assert
        assertEquals(-30, result);
    }

    @Test
    @DisplayName("Given a calculator when 1 is multiplied by 0 then the product is equal to 0")
    void givenACalculatorWhen1IsMultipliedBy0ThenTheProductIsEqualTo0() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.multiply(1, 0);

        // assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Given a calculator when 1 is multiplied by 10 then the product is equal to 10")
    void givenACalculatorWhen1IsMultipliedBy10ThenTheProductIsEqualTo10() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.multiply(1, 10);

        // assert
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Given a calculator when -10 is multiplied by 10 then the product is equal to -100")
    void givenACalculatorWhenNegative10IsMultipliedBy10ThenTheProductIsEqualToNegative100() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.multiply(-10, 10);

        // assert
        assertEquals(-100, result);
    }

    @Test
    @DisplayName("Given a calculator when -10 is multiplied by -15 then the product is equal to 150")
    void givenACalculatorWhenNegative10IsMultipliedByNegative15ThenTheProductIsEqualToNegative150() {
        // arrange
        final var calculator = new Calculator();

        // act
        final var result = calculator.multiply(-10, -15);

        // assert
        assertEquals(150, result);
    }

}
