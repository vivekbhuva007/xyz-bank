package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomerLoginPage extends Utility {

    By clickOnLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    public void userClickOnLoginTab(){
        clickOnElement(clickOnLoginTab);

    }
    By clickOnYourName = By.xpath("//select[@id='userSelect']");
    public void userClickOnYourName(){
        clickOnElement(clickOnYourName);
    }
    By selectYourNameFromDropDown = By.xpath("//select[@id='userSelect']/child::*");
    public void userSelectYourNameFromDropDown(){
        List<WebElement> names = driver.findElements(selectYourNameFromDropDown);
        selectOptionsFromDropDown(names,"kriti sanon");
    }

    By clickOnLoginButton = By.xpath("//button[contains(text(),'Login')]");
    public void userClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

    By verifyLogoutText = By.xpath("//button[contains(text(),'Logout')]");
    public String verifyLogoutMessage(){
        return getTextFromElement(verifyLogoutText);
    }
    By clickOnLogOutButton = By.xpath("//button[contains(text(),'Logout')]");
    public void userClickOnLogOutButton(){
        clickOnElement(clickOnLogOutButton);
    }

    By verifyYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyYourNameTextinCustomerLogInPage(){
        return getTextFromElement(verifyYourNameText);
    }

}
