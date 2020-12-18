package api;

import api.models.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.guice.ScenarioScoped;
import io.restassured.response.Response;
import lombok.Data;

@Data
@ScenarioScoped
 public class GetUserContex {

    private Response httpResponse;
    private Users[] users;


    public Users[] getUsers(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            users = mapper.readValue(getHttpResponse().getBody().asString(),Users[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return users;
    }


}
