package service;

import com.google.gson.JsonObject;
import controller.CasesController;
import controller.CasesImplementation;
import io.restassured.response.Response;
import jdk.nashorn.api.scripting.JSObject;
import model.All;
import model.Cases;
import model.Country;
import org.json.JSONObject;
import restConsumer.ResponseUtil;
import restConsumer.RestUtils;
import utilBuilder.*;

import java.util.*;

public class CasesService   {


    static CasesController casesImplementation  = new CasesImplementation();


    public static List<Long> cases_country_service(){
        String baseUrl = UrlBuilder.buildURL();
        String endPoint = EndPoints.CASES;
        Response response = casesImplementation.cases(baseUrl + endPoint,
                generateParam(), generateHeader());
        Assertions.assertValue(ResponseUtil.getStatusCode(response),
                Integer.parseInt(StatusCodes.SUCCESS.toString()));



        String responseBody = ResponseUtil.getResponseBody(response);
        JSONObject json = new JSONObject(responseBody);
        int cases = json.length();
        String[] countries={"Afghanistan","Albania","Algeria","Andorra","Angola"};
        for (int i = 0; i < cases; i++) {
            json.getJSONObject(countries[i]);
        }

        Cases casepojo = JsonConverter.parseResponse(responseBody, Cases.class);
        List<Long> list = calcualateCases(casepojo);
        Collections.sort(list);
        return list;
    }




    public static List<Long> calcualateCases(Cases cases){

        List<Country> countryList = (List<Country>) cases.getCountry();

        List<HashMap<String,Long>> list = new ArrayList<>();

        List<Long> listCases = new ArrayList<>();
        for (int i = 0; i < countryList.size(); i++) {
            All all = countryList.get(i).getAll();
            long confirmed = all.getConfirmed();
            long deaths = all.getDeaths();
            long population = all.getPopulation();
            String updatedDate = all.getUpdated();
            all.getContinent();
            all.getLife_expectancy();
            HashMap<String,Long> map = new HashMap<>();
            long cal = population-confirmed-deaths;
            if(cal<=Constants.CASES){
                map.put(all.getCountry(),cal);
                listCases.add(cal);
            }
            list.add(map);
        }
        return listCases;
    }
    //24,35,353


    public static HashMap<String,String> generateParam(){
        HashMap<String,String> map = new HashMap<String,String>();
        return map;
    }

    public static HashMap<String,String> generateHeader(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Content-Type","application/json");
        return map;
    }
}
