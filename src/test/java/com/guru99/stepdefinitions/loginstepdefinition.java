package com.guru99.stepdefinitions;

import com.guru99.pageobjects.homepage;
import com.guru99.pageobjects.loginpage;
import io.cucumber.java.en.*;
import org.apache.log4j.*;
import org.junit.Assert;

public class loginstepdefinition extends baseClassStepDefinition {



    @Given("User opens Bank Login {string}")
    public void user_opens_bank_login(String url) throws InterruptedException {

        logger= Logger.getLogger("Guru99");
        PropertyConfigurator.configure("log4j.properties");
        chromedriver();
        driver.manage().window().maximize();
        //driver.get(url);
        driver.get(baseurl);
        Thread.sleep(5000);


    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String userid, String pwd) {
        loginpageObj = new loginpage(driver);
        loginpageObj.AcceptAll();
        //loginpageObj.enterUserId(userid);
        loginpageObj.enterUserId(baseusername);
        //loginpageObj.enterPassword(pwd);
        loginpageObj.enterPassword(basepassword);

    }
    @When("clicks on Login button")
    public void clicks_on_login_button() {
        loginpageObj.clickLoginButton();
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        homepageObj = new homepage(driver);
        Assert.assertEquals("GTPL Bank Manager HomePage",homepageObj.gethomepageTitle());
        logger.info("User has successfully logged in");


    }

    @And("on clicking logout using user be successfully logged out")
    public void Successfullogout() throws InterruptedException {
        homepageObj.clickLogoutButton();
        Thread.sleep(3000);
        driver.switchTo().alert();
        Assert.assertEquals("You Have Succesfully Logged Out!!",driver.switchTo().alert().getText());
        logger.info("User is successfully logged out");
        driver.switchTo().alert().accept();



    }

    @And("browser should be closed")
    public void closetheBrowser() {
        closeBrowser();
    }


}
