package steps;

import api.GetUserContex;
import api.apiHelper.RestAssuredUtil;
import api.models.Users;
import com.google.inject.Inject;
import helper.TestConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 23/12/2020
 * Time: 23:18
 */
public class GetUsers_Steps {

    @Inject
    private GetUserContex getUserContex;

    private static final String HOST = TestConfiguration.getProperty("api.BaseURL");

    /**
     * Make a api call for get user
     *
     * @param PATH
     */
    @Given("^: I get perform GET operation for \"([^\"]*)\"$")
    public void i_get_perform_get_operation_for(String PATH) {
        Response response = RestAssuredUtil.sendGetRequest(HOST, PATH);
        getUserContex.setHttpResponse(response);

    }

    /**
     * Get api response and inject to getUserContex
     */
    @When("I get user list")
    public void i_get_user_list() {
        getUserContex.getHttpResponse().getBody().prettyPrint();
    }

    /**
     * Check response code and verify user list exist
     *
     * @param string
     */
    @Then("I verify response code {string}")
    public void i_verify_response_code(String string) {
        List<Users> users = Arrays.asList(getUserContex.getUsers());
        Optional<Users> optionalUsers = users.stream().filter(users1 -> users1.getPage().equals(1)).findFirst();
        Assert.assertEquals(getUserContex.getHttpResponse().statusCode(), 200);
        Assert.assertEquals(optionalUsers.get().getData().get(0).firstName, "George");
    }

}
