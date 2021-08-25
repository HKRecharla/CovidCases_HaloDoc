package controller;

import io.restassured.response.Response;

import java.util.HashMap;

public interface CasesController {

    public Response cases(String url, HashMap<String,String> params, HashMap<String,String> header);
    public void history();
    public void vaccines();

}
