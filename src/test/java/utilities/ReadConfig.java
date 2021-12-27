package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {
        File scr = new File("src/test/Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(scr);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        return pro.getProperty("url");
    }

    public String getusername() {
        return pro.getProperty("username");
    }

    public String getPassword() {
        return pro.getProperty("Password");
    }
}
