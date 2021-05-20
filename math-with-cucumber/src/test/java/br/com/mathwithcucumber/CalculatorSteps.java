package br.com.mathwithcucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

    private Calculator calculator;
    private int result;

    @Given("a calculator")
    public void a_calculator() {
        this.calculator = new Calculator();
    }

    @When("{int} is added to {int}")
    public void is_added_to(int firstValue, int secondValue) {
        this.result = this.calculator.add(firstValue, secondValue);
    }

    @Then("must return the sum {int}")
    public void must_return_the_sum(int result) {
        assertEquals(result, this.result);
    }

    @When("{int} is subtracted from {int}")
    public void is_subtracted_from(int firstValue, int secondValue) {
        this.result = this.calculator.subtract(firstValue, secondValue);
    }

    @Then("must return the difference {int}")
    public void must_return_the_difference(int result) {
        assertEquals(result, this.result);
    }

}
