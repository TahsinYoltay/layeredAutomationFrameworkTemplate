package steps;

import api.models.Users;
import com.google.inject.Inject;
import api.GetUserContex;
import api.RestAssuredUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 23:18
 */
public class GetUsers_Steps {

//    @Inject
    private GetUserContex getUserContex;

    private static final String HOST ="https://reqres.in/api";
    private static final String PATH ="/users";


    @Given(": I get perform GET operation for {string}")
    public void i_get_perform_get_operation_for(String string) {

    }

    @When("I get user list")
    public void i_get_user_list() {
        Response response = RestAssuredUtil.sendGetRequest(HOST,PATH);
        getUserContex.setHttpResponse(response);

    }

    @Then("I verify response code {string}")
    public void i_verify_response_code(String string) {
        List<Users> users = Arrays.asList( getUserContex.getUsers());
        Optional<Users>  optionalUsers = users.stream().filter(users1 -> users1.getFirstName().equals("George")).findFirst();
        assertTrue("test snycy", optionalUsers.isPresent());
    }

}
