package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 20:58
 */
public class RestAssuredTest_Steps {
    @Given("I get perform POST operation for {string}")
    public void i_get_perform_post_operation_for(String string) {
            System.out.println("Test 1");
    }

    @When("I send a valid register paylod {string} and {string}")
    public void i_send_a_valid_register_paylod_and(String string, String string2) {
        System.out.println("Test 2");

    }

    @Then("response status code should be {string}")
    public void response_status_code_should_be(String string) {
        System.out.println("Test 3");

    }
}
