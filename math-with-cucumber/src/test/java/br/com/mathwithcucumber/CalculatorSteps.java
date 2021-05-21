package br.com.mathwithcucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

    private Calculator calculator;
    private int intResult;
    private double doubleResult;
    private String errorMessage;

    @Given("a calculator")
    public void a_calculator() {
        this.calculator = new Calculator();
    }

    @When("{int} is added to {int}")
    public void is_added_to(int firstValue, int secondValue) {
        this.intResult = this.calculator.add(firstValue, secondValue);
    }

    @Then("must return the sum {int}")
    public void must_return_the_sum(int result) {
        assertEquals(result, this.intResult);
    }

    @When("{int} is subtracted from {int}")
    public void is_subtracted_from(int firstValue, int secondValue) {
        this.intResult = this.calculator.subtract(firstValue, secondValue);
    }

    @Then("must return the difference {int}")
    public void must_return_the_difference(int result) {
        assertEquals(result, this.intResult);
    }

    @When("{int} is multiplied by {int}")
    public void is_multiplied_by(int firstValue, int secondValue) {
        this.intResult = this.calculator.multiply(firstValue, secondValue);
    }

    @Then("must return a product equals to {int}")
    public void must_return_a_product_equals_to(int result) {
        assertEquals(result, this.intResult);
    }

    @When("{int} is divided by {int}")
    public void is_divided_by(int firstValue, int secondValue) {
        this.doubleResult = this.calculator.divide(firstValue, secondValue);
    }

    @Then("must return a quotient equals to {double}")
    public void must_return_a_quotient_equals_to(double result) {
        assertEquals(result, this.doubleResult);
    }

    @When("{int} is divided by zero")
    public void is_divided_by_zero(int firstValue) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> this.calculator.divide(firstValue, 0));
        assertNotNull(exception);

        this.errorMessage = exception.getMessage();
    }

    @Then("must return an error with the message {string}")
    public void must_return_an_error_with_the_message(String message) {
        assertEquals(message, this.errorMessage);
    }


}
