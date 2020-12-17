package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import io.cucumber.guice.ScenarioScoped;
//import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 23:49
 */

@Data
//@ScenarioScoped
//@ScenarioScoped
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    private String firstName;
    private String lastName;
}
