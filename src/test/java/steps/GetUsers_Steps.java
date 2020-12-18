package steps;

import api.models.Users;
import com.google.inject.Inject;
import api.GetUserContex;
import api.apiHelper.RestAssuredUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 23:18
 */
public class GetUsers_Steps {

    @Inject
    private GetUserContex getUserContex;

    private static final String HOST ="https://reqres.in/api";
    private static final String PATH ="/users";


    @Given(": I get perform GET operation for {string}")
    public void i_get_perform_get_operation_for(String string) {
        Response response = RestAssuredUtil.sendGetRequest(HOST,PATH);
        getUserContex.setHttpResponse(response);
    }

    @When("I get user list")
    public void i_get_user_list() {

        getUserContex.getHttpResponse().getBody().prettyPrint();
        List<Users> users = Arrays.asList( getUserContex.getUsers());

    }

    @Then("I verify response code {string}")
    public void i_verify_response_code(String string) {
//        List<Users> users = Arrays.asList( getUserContex.getUsers());
//        Optional<Users>  optionalUsers = users.stream().filter(users1 -> users1.getTotal().equals("George")).findFirst();
        Assert.assertEquals(getUserContex.getHttpResponse().statusCode(),200);
     }

}
