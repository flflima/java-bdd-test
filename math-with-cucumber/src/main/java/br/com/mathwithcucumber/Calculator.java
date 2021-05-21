package br.com.mathwithcucumber;

public class Calculator {

    public int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public int subtract(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public double divide(int firstValue, int secondValue) {
        if(secondValue==0){
            throw new IllegalArgumentException("Divisor is equal to zero!");
        }
        return (double) firstValue / secondValue;
    }
}
