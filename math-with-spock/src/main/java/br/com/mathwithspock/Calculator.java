package br.com.mathwithspock;

public class Calculator {

    public int add(final int first, final int second) {
        return first + second;
    }

    public int minus(final int first, final int second) {
        return first - second;
    }

    public int multiply(final int first, final int second) {
        return first * second;
    }

    public double divide(final int first, final int second) {
        if (second == 0) {
            throw new IllegalArgumentException("Divisor is equal to zero!");
        }
        return (double) first / second;
    }
}
