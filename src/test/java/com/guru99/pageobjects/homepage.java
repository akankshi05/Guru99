package com.guru99.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

    WebDriver xdriver;

    public homepage(WebDriver ydriver){
        xdriver=ydriver;
        PageFactory.initElements(ydriver,this);
    }

    @FindBy(linkText = "Log out")
    WebElement LogoutButton;

    public String gethomepageTitle(){
        return xdriver.getTitle();
    }

    public void clickLogoutButton(){
        LogoutButton.click();
    }
}
