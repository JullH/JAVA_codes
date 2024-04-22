package src.jdbc.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * @version 1.0
 * @auther JullH
 */

public class DbUtilsSample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        String propertyFile = DruidSample.class.getResource("/druid-config.properties").getPath();

        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
