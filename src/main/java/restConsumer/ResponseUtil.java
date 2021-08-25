package restConsumer;

import io.restassured.response.Response;

import java.util.logging.Logger;

public class ResponseUtil {


    public static int getStatusCode(Response response){
        int statusCode = response.getStatusCode();
        //we can implemet logger
        System.out.println("Status_code ==> "+statusCode);
        return statusCode;
    }


    public static  String getResponseBody(Response response){
        String res_body = response.asString();
        System.out.println("Response Body ==> "+res_body);
        return res_body;
    }



}
