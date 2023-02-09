package org.example.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//@Configuration
public class ConfigurationFile {
    public static String getProperty(String key) throws IOException {
        try {
            File f = new File("./configurationFiles/properties");
            FileReader fileReader = new FileReader(f);
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.get(key).toString();
        }
        catch (Exception e){
            return null;
        }
    }
    public static String elementLocators(String key) throws IOException {
        try {
            File f = new File("./configurationFiles/locatorProperties");
            FileReader fileReader = new FileReader(f);
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.get(key).toString();
        } catch (Exception e) {
            return null;
        }
    }
}
