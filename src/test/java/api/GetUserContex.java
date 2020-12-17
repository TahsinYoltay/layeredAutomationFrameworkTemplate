package api;

import api.models.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import io.cucumber.guice.ScenarioScoped;
import io.restassured.response.Response;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 23:42
 */

@Data
//@ScenarioScoped
public class GetUserContex {

    private Response httpResponse;
    private Users[] users;


    public Users[] getUsers(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            users = mapper.readValue(getHttpResponse().getBody().asString(),Users[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return users;
    }
}
