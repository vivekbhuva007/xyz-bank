package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import com.github.dockerjava.api.model.CpuUsageConfig;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    HomePage homePage = new HomePage();
    OpenCustomerPage openCustomerPage = new OpenCustomerPage();





    @Test
public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.userClickOnBankManger();
        bankManagerLoginPage.userShouldClickOnAddCustomerButton();
        customerPage.userEnterFirstName("kriti");
        customerPage.userEnterLastName("sanon");
        customerPage.userEnterPostCode("ha04ay");
        customerPage.userClickOnAddCustomerAfterFillInFOrm();
        customerPage.getTextFromPopUp();
        String ExpectedMessage = "Customer added successfully with customer id :6";
        Assert.assertEquals(customerPage.getTextFromAlert(), ExpectedMessage, "No Message Displayed");
        customerPage.acceptAlert();
    }

        @Test
       public void bankManagerShouldOpenAccountSuccessfully(){
            bankManagerLoginPage.userClickOnBankManger();
            openCustomerPage.userShouldClickOnOpenAccountPage();
            openCustomerPage.userShouldClickOnCustomerName();
            openCustomerPage.userShouldSelectCustomerNameFromDropDown();
            openCustomerPage.userClickOnCurrencyButton();
            openCustomerPage.selectCurrencyInPoundFromDropDown();
            openCustomerPage.userClickOnProcessButton();
            customerPage.getTextFromPopUp();
            String ExpectedMessage = "Account created successfully with account Number :1016";
            Assert.assertEquals(customerPage.getTextFromAlert(), ExpectedMessage, "No Message Displayed");
            customerPage.acceptAlert();

    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        String expectedMessage = "Logout";
        Assert.assertEquals(customerLoginPage.verifyLogoutMessage(),expectedMessage,"NO Message Displayed");
        customerLoginPage.userClickOnLogOutButton();
        String expectedText = "Your Name :";
        Assert.assertEquals(customerLoginPage.verifyYourNameTextinCustomerLogInPage(),expectedText,"No Message Displayed");



    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.userClickOnAmountToBeDepositedAndAdded100();
        accountPage.userClickOnDepositButton();
        String expectedText = "Deposit Successful";
        Assert.assertEquals(accountPage.userVerifyDepositSuccessFull(),expectedText,"no message displayed");


    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        customerLoginPage.userClickOnLoginTab();
        customerLoginPage.userClickOnYourName();
        customerLoginPage.userSelectYourNameFromDropDown();
        customerLoginPage.userClickOnLoginButton();
        accountPage.userClickOnWithDrawl();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        String ExpectedMessage = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),ExpectedMessage,"No messageDisplayed");



    }



}

