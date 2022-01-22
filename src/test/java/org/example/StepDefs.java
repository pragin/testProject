package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs {

    NumberTest numberTest = new NumberTest();



    @When("the input is {int}")
    public void the_input_is(int number) {
            numberTest.setSum(number);
    }
    @Then("the result is {int}")
    public void the_result_is(int sum) {
        Assert.assertEquals(numberTest.getSum(),sum);
    }

}
