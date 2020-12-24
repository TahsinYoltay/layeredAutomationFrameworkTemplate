package api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.cucumber.guice.ScenarioScoped;
import lombok.Data;

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

    public PostData() {
    }

    public PostData(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
