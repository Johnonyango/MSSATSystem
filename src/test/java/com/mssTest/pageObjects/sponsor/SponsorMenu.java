package com.mssTest.pageObjects.sponsor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SponsorMenu {
    WebDriver localDriver;

    public SponsorMenu(WebDriver remoteDriver) {
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }


//    @FindBy(xpath = "//*[contains(@data-componentid,'ext-button-6')]")
    @FindBy(xpath = "//div[@id='ext-element-51']")
    @CacheLookup
    WebElement btnPersonalInfo;

    @FindBy(xpath = "//div[@id='ext-element-52']")
    @CacheLookup
    WebElement btnPayrolls;

    @FindBy(xpath = "//div[@id='ext-element-53']")
    @CacheLookup
    WebElement btnDeductions;

    @FindBy(xpath = "//div[@id='ext-element-54']")
    @CacheLookup
    WebElement btnCOE;

    @FindBy(xpath = "//div[@id='ext-element-55']")
    @CacheLookup
    WebElement btnTickets;

    @FindBy(xpath = "//div[@id='ext-element-56']")
    @CacheLookup
    WebElement btnActivityLogs;

    @FindBy(xpath = "//div[@id='ext-element-57']")
    @CacheLookup
    WebElement btnManageAccount;

    @FindBy(xpath = "//div[@id='ext-element-50']")
    @CacheLookup
    WebElement btnHome;

    @FindBy(name = "currentPassword")
    @CacheLookup
    WebElement enterCurrentPassword;

    @FindBy(name = "newPassword")
    @CacheLookup
    WebElement enterNewPassword;

    @FindBy(name = "confirmPassword")
    @CacheLookup
    WebElement confirmNewPassword;

//    @FindBy(xpath = "//button[@id='ext-element-420']")
    @FindBy(css = "#ext-element-420")
    @CacheLookup
    WebElement btnSaveNewPassword;

    public void viewPersonalInfo(){
        btnPersonalInfo.click();
    }

    public void viewPayrolls(){
        btnPayrolls.click();
    }

    public void viewDeductions(){
        btnDeductions.click();
    }

    public void viewCOE(){
        btnCOE.click();
    }

    public void viewTickets(){
        btnTickets.click();
    }

    public void viewLogs(){
        btnActivityLogs.click();
    }

    public void clickManageAccount(){
        btnManageAccount.click();
    }

    public void returnHome(){
        btnHome.click();
    }

    public void changePassword(){
        clickManageAccount();
        enterCurrentPassword.sendKeys("Admin@123");
        enterNewPassword.sendKeys("Admin@123");
        confirmNewPassword.sendKeys("Admin@123");
        btnSaveNewPassword.click();
    }
}
