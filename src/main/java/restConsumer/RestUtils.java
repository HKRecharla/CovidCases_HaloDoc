package restConsumer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class RestUtils {

    private static Response response;


    public static RequestSpecification requestBuilder(){
        return RestAssured.given();
    }


    public static Response getCall(RequestSpecification rs,
                               String url, HashMap<String,String> param,
                               HashMap<String,String> header){
        return rs.when().queryParams(header).headers(header).get(url);
    }





    public static void postCall(){

    }
}
