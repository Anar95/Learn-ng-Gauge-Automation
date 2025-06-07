package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class LocatorReader {


    private static final String LOCATOR_PATH = "src/test/resources/locators/loginTest.json";

    public  static String getLocatorType(String elementName) throws  Exception{
        JsonObject json = JsonParser.parseReader(new FileReader(LOCATOR_PATH)).getAsJsonObject();
        JsonObject element = json.getAsJsonObject(elementName);
        return  element.get("locatorType").getAsString();

        // elementName = "Email text" olsa
        // Json icinde "Email text" adli blok tapir ve blokun
        // ici element adli bir JsonObject olur

        // "Email text": {
        //   "locatorType": "XPATH",
        //   "locatorsValue": "//input[@id='CustomerEmail']"
        //  },
    }

    public  static  String getLocatorValue(String elementName) throws  Exception{
        JsonObject json = JsonParser.parseReader(new FileReader(LOCATOR_PATH)).getAsJsonObject();
        JsonObject element = json.getAsJsonObject(elementName);
        return  element.get("locatorValue").getAsString();
    }
}
