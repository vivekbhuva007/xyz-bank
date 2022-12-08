package com.bank.pages;

import com.bank.utility.Utility;
import org.bouncycastle.asn1.cmc.DecryptedPOP;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By clickOnDeposit = By.xpath("//div[@class='borderM box padT20 ng-scope']/div[3]/button[2]");
    public void userClickOnDeposit(){
        clickOnElement(clickOnDeposit);

    }
    By clickOnAmount = By.xpath("//input[@placeholder='amount']");
    public void userClickOnAmountToBeDepositedAndAdded100(){
        clickOnElement(clickOnAmount);
        sendTextToElement(clickOnAmount,"100");
    }
    By clickOnDepositButton = By.xpath("//form[@role='form']/button");
    public void userClickOnDepositButton(){
        clickOnElement(clickOnDepositButton);
    }
    By verifyDepositSuccessFull = By.xpath("//form[@role='form']/button");
    public String userVerifyDepositSuccessFull(){
        return getTextFromElement(verifyDepositSuccessFull);
    }
    By clickOnWithDrawl = By.xpath("//div[@class='borderM box padT20 ng-scope']/div[3]/button[3]");
    public void userClickOnWithDrawl(){
        clickOnElement(clickOnWithDrawl);
    }
    By withdrawAmount = By.xpath("//input[@placeholder='amount']");
    public void userClickOnAmountToBeWithDrawn50(){
        clickOnElement(clickOnAmount);
        sendTextToElement(clickOnAmount,"50");
    }

    By clickOnWithdrawButton = By.xpath("//button[@type='submit']");
    public void userClickOnWithdrawButton(){
        clickOnElement(clickOnWithdrawButton);
    }
    By verifyTransactionMessage = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String verifyTransactionMessage(){
        return getTextFromElement(verifyTransactionMessage);

    }






}
