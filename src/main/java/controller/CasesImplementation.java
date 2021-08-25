package controller;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restConsumer.RestUtils;

import java.util.HashMap;

public class CasesImplementation implements CasesController {


    //Get Call
    @Override
    public Response cases(String url, HashMap<String,String> headers, HashMap<String,String> params) {
       return RestUtils.getCall(RestUtils.requestBuilder(), url, params, headers);
    }

    @Override
    public void history() {

    }

    @Override
    public void vaccines() {

    }
}
