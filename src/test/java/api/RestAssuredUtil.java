package api;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 23:23
 */

import io.restassured.response.Response;

import java.util.Map;

import  static  io.restassured.RestAssured.given;
public class RestAssuredUtil {

    public static Response sendGetRequest(String host, String path){
        return given().baseUri(host).basePath(path).get().then().extract().response();

//       return given().baseUri(host).basePath(path).headers(headers).get().then().extract().response();
    }
}
