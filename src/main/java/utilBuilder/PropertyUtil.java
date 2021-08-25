package utilBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {


    public static Properties gretProperty(String path){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    return properties;
    }


    /**
     * Reading property from COnfig.proeprties
     * @param key
     * @return
     */
    public static String getValue(String key){
        Properties prop = gretProperty(Constants.CONFIG_PATH);
        return prop.getProperty(key).toString();
    }




}
