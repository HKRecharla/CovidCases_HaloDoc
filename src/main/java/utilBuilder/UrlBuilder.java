package utilBuilder;

public class UrlBuilder {


    public static String buildURL(){
        return PropertyUtil.getValue(Constants.URL);
    }
}
