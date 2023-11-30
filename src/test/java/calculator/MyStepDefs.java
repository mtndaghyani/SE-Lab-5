package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepDefs {
    private Calculator calculator;
    private int firstValue;
    private int secondValue;
    private int calculatorResult;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}")
    public void twoInputValuesAnd(int firstInput, int secondInput) {
        this.firstValue = firstInput;
        this.secondValue = secondInput;
    }

    @When("I add the two values")
    public void iAddTheTwoValues() {
        this.calculatorResult = calculator.sum(firstValue, secondValue);
        System.out.println(this.calculatorResult);
    }

    @Then("I expect the result {int}")
    public void iExpectTheResult(int expectedResult) {
        Assert.assertEquals(expectedResult, this.calculatorResult);
    }

    @Given("Input values, {int} and {int}")
    public void inputValuesAnd(int arg0, int arg1) {
        this.firstValue = arg0;
        this.secondValue = arg1;
    }

    @Given("Input values, {int} and {int} and {word}")
    public void threeInputValuesFirstAndSecondAndOpt(int first, int second, String operator) {
        this.firstValue = first;
        this.secondValue = second;
        switch (operator) {
            case "*" -> {
                calculator.multiple(first , second);
                this.calculatorResult = calculatorResult;
            }
            case "/" -> {
                calculator.divide(first , second ) ;
                this.calculatorResult = calculatorResult;
            }
            case "^" -> {
                calculator.power(first , second) ;
                this.calculatorResult = calculatorResult;
            }
            default -> {
                throw new RuntimeException("Unsupported Operator");
            }
        }
        System.out.println(this.calculatorResult);
    }

    @When("I multiple the values")
    public void iMultipleTheResult() {
        calculator.multiple(firstValue , secondValue) ;
        this.calculatorResult = calculatorResult ;
        System.out.println(this.calculatorResult);
    }

    @When("I divide the values")
    public void iDivideTheResult() {
        calculator.divide(firstValue , secondValue) ;
        this.calculatorResult = calculatorResult ;
        System.out.println(this.calculatorResult);
    }

    @When("I power the values")
    public void iPowerTheResult() {
        calculator.power(firstValue , secondValue) ;
        this.calculatorResult = calculatorResult ;
        System.out.println(this.calculatorResult);
    }

    @Then("I expect the {int}")
    public void iExpectThe(int expectedResult) {
        Assert.assertEquals(this.calculatorResult, expectedResult);
    }
}
