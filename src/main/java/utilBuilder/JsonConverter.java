package utilBuilder;


import com.google.gson.Gson;
import model.Cases;

public class JsonConverter {


    public static <T> T parseResponse(String body, Class<T> tclass ){
        Gson gson = new Gson();
        T gsonValue = gson.fromJson(body, tclass);
        return gsonValue;
    }



}
