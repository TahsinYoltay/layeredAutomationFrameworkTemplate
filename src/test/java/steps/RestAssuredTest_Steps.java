package steps;

import api.PostUserContex;
import api.apiHelper.RestAssuredUtil;
import api.models.PostData;
import com.google.inject.Inject;
import helper.TestConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 23/12/2020
 * Time: 20:58
 */
public class RestAssuredTest_Steps {
    private static final String HOST = TestConfiguration.getProperty("api.BaseURL");

    @Inject
    PostUserContex postUserContex;
    @Inject
    PostData postData;

    /**
     * Creted valid register payload
     *
     * @param email
     * @param password
     */
    @Given("I creted valid register payload {string} and {string}")
    public void i_get_perform_post_operation_for(String email, String password) {
        postData.setEmail(email);
        postData.setPassword(password);
    }

    /**
     * Register user
     *
     * @param PATH
     */
    @When("I get perform POST operation for {string}")
    public void i_send_a_valid_register_paylod_and(String PATH) {
        String body = RestAssuredUtil.bodyBuilder(postData.getEmail(), postData.getPassword());
        Response response = RestAssuredUtil.sendPostRequest(HOST, PATH, body);
        postUserContex.setHttpResponse(response);
    }

    /**
     * Check the response code
     *
     * @param statusCode
     */
    @Then("^response status code should be \"([^\"]*)\"$")
    public void response_status_code_should_be(int statusCode) {
        Assert.assertEquals(postUserContex.getHttpResponse().statusCode(), statusCode);


    }
}
