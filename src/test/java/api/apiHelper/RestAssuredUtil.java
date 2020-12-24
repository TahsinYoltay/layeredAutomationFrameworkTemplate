package api.apiHelper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredUtil {

    /**
     * @param host the api host name
     * @param path the api path
     * @return api response
     */
    public static Response sendGetRequest(String host, String path) {
        return given().baseUri(host).basePath(path).get().then().extract().response();
    }


    /**
     * @param host the api host name
     * @param path the api path
     * @param body request body
     * @return
     */
    public static Response sendPostRequest(String host, String path, String body) {
        return given().contentType(ContentType.JSON)
                .baseUri(host).basePath(path)
                .with()
                .body(body)
                .post()
                .then()
                .extract()
                .response();
    }

    /**
     * @param email    api body first parameter
     * @param password api body second parameter
     * @return returns suitable api body
     */
    public static String bodyBuilder(String email, String password) {
        return "{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}";
    }

}
