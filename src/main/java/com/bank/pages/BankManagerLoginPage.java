package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By clickOnBankMangerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void userClickOnBankManger() {
        clickOnElement(clickOnBankMangerLogin);
    }

    By clickOnAddCustomer = By.xpath("//button[contains(text(),'Add Customer')]");

    public void userShouldClickOnAddCustomerButton() {
        clickOnElement(clickOnAddCustomer);
    }


}





