package steps;

import api.PostUserContex;
import api.apiHelper.RestAssuredUtil;
import api.models.PostData;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 20:58
 */
public class RestAssuredTest_Steps {
    private static final String HOST ="https://reqres.in/api";
    private static final String PATH ="/register";

    @Inject
    PostUserContex postUserContex;
    @Inject
    PostData postData;

    @Given("I creted valid register payload {string} and {string}")
    public void i_get_perform_post_operation_for(String email,String password) {
        postData.setEmail(email);
        postData.setPassword(password);
    }

     @When("I get perform POST operation for {string}")
    public void i_send_a_valid_register_paylod_and(String string ) {
        String body = RestAssuredUtil.bodyBuilder(postData.getEmail(),postData.getPassword());
        Response response = RestAssuredUtil.sendPostRequest(HOST,PATH,body);
        postUserContex.setHttpResponse(response);
    }


     @Then("^response status code should be \"([^\"]*)\"$")
    public void response_status_code_should_be(int statusCode) {
         Assert.assertEquals(postUserContex.getHttpResponse().statusCode(),statusCode);


     }
}
