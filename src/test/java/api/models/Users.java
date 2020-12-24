package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.cucumber.guice.ScenarioScoped;
import lombok.Data;

import java.util.List;

@Data
@ScenarioScoped
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "page",
        "per_page",
        "total",
        "total_pages",
        "data",
        "support"
})

public class Users {
    @JsonProperty("page")
    public Integer page;
    @JsonProperty("per_page")
    public Integer perPage;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("total_pages")
    public Integer totalPages;
    @JsonProperty("data")
    public List<Datum> data = null;
    @JsonProperty("support")
    public Support support;

    public Users() {
    }

    /**
     * @param page
     * @param perPage
     * @param total
     * @param totalPages
     * @param data
     * @param support
     */
    public Users(Integer page, Integer perPage, Integer total, Integer totalPages, List<Datum> data, Support support) {
        super();
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.support = support;
    }

}
