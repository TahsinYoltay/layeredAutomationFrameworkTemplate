package api;

import api.models.PostData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.guice.ScenarioScoped;
import io.restassured.response.Response;
import lombok.Data;


@Data
@ScenarioScoped
public class PostUserContex {

    private Response httpResponse;
    private PostData[] postData;

    /**
     * @return post request body
     */
    public PostData[] setBody() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            postData = mapper.readValue(getHttpResponse().getBody().asString(), PostData[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return postData;
    }



}
