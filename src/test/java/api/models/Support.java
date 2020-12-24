package api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.cucumber.guice.ScenarioScoped;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "text"
})
@Data
@ScenarioScoped
public class Support {

    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;

    public Support() {
    }

    /**
     * @param text
     * @param url
     */
    public Support(String url, String text) {
        super();
        this.url = url;
        this.text = text;
    }
}