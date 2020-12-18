package api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.cucumber.guice.ScenarioScoped;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "email",
        "password"
})
@Data
@ScenarioScoped
public class PostData {
    @JsonProperty("email")
    public String email;
    @JsonProperty("password")
    public String password;


}
