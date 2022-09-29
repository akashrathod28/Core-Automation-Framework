package Test.Selenium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    static Properties properties;

    public PropertyReader(){
        loadAllProperties();
    }

    public void loadAllProperties(){
        properties = new Properties();
        try{
            String fileName = System.getProperty("user.dir")+"/src/main/Resources/prod_config.properties";
            properties.load(new FileInputStream(fileName));
        }catch(IOException e){

        }
    }

    public static String readItem(String key){
        return properties.getProperty(key);

    }
}
