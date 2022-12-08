package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    public void userEnterFirstName(String firstName){
        sendTextToElement(enterFirstName,firstName);
    }
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");
    public void userEnterLastName(String lastName){
        sendTextToElement(enterLastName,lastName);
    }
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");
    public void userEnterPostCode(String postcode){
        sendTextToElement(enterPostCode,postcode);
    }
    By clickOnAddCustomer = By.xpath("//button[@type='submit']");
    public void userClickOnAddCustomerAfterFillInFOrm(){
        clickOnElement(clickOnAddCustomer);
    }


    public String getTextFromPopUp() {
      //  Alert text = driver.switchTo().alert();  // Getting the text from alert
      //  String alert = text.getText();
      //  System.out.println("Message displayed:  " + alert);
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }





}
