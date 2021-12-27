package com.guru99.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class loginpage {
    WebDriver xdriver;

    public loginpage(WebDriver ydriver){
        xdriver=ydriver;
        PageFactory.initElements(ydriver,this);
    }

    @FindBy(name = "uid")
    WebElement userId;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="btnLogin")
    WebElement LoginButton;

    @FindBy(id = "save")
    WebElement AcceptAllButton;

    public void enterUserId(String userid){
        userId.sendKeys(userid);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLoginButton(){
        LoginButton.click();
    }

    public void AcceptAll(){

        xdriver.switchTo().frame("gdpr-consent-notice");
            AcceptAllButton.click();

    }




}
