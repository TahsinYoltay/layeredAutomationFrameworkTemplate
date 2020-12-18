package api.apiHelper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import  static  io.restassured.RestAssured.given;

public class RestAssuredUtil {

    public static Response sendGetRequest(String host, String path){
        return given().baseUri(host).basePath(path).get().then().extract().response();
    }


    public static Response sendPostRequest(String host, String path,String body){
        return given().contentType(ContentType.JSON)
                .baseUri(host).basePath(path)
                .with()
                .body(body)
                .post()
                .then()
                .extract()
                .response();
    }

    public static String bodyBuilder(String email, String password){
          String payload =  "{\"email\":\""+email+"\",\"password\":\""+password+"\"}";
        return payload;
    }

}
