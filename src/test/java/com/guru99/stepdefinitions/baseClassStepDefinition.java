package com.guru99.stepdefinitions;

import com.guru99.pageobjects.homepage;
import com.guru99.pageobjects.loginpage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReadConfig;

public class baseClassStepDefinition {
    ReadConfig readconfigObj = new ReadConfig();
    WebDriver driver;
    Logger logger;
    loginpage loginpageObj;
    homepage homepageObj;

    String baseurl = readconfigObj.getApplicationURL();
    String baseusername = readconfigObj.getusername();
    String basepassword = readconfigObj.getPassword();

public void chromedriver(){

    System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
     driver = new ChromeDriver();
}

    public void firefoxdriver(){

        System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

public void closeBrowser(){
    driver.quit();
}


}
