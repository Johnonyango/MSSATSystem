package com.mssTest.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClaimProcessing {
    WebDriver localDriver;

    public ClaimProcessing(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//*[contains(@data-recordindex, 4)]")
    WebElement claimsBtn;

    @FindBy(xpath = "//*[contains(@data-componentid,'btnInitiateClaim')]")
    WebElement initiateClaimBtn;

    @FindBy(xpath = "//*[contains(@data-componentid,'btnProeedInitiateClaim')]")
    WebElement proceedBtn;

//    ext-button-11

    @FindBy(xpath = "//*[contains(@data-componentid,'btnValidateStepOne')]")
    WebElement btnValidateStepOne;

    @FindBy(xpath = "//div[@id='ext-element-408']")
    WebElement dropDownBtn;

    @FindBy(name = "benefitReason")
    WebElement selectExitReason;


    public void clickClaimsBtn(){
        claimsBtn.click();
    }

    public void clickInitiateClaimBtn(){
        initiateClaimBtn.click();
    }

    public void clickProceedBtn(){
        proceedBtn.click();
    }

    public void validateStepOne(){
        btnValidateStepOne.click();
    }

    public void clickReasonBox(){
        dropDownBtn.click();
    }

    public void selectReason(){
        Select reasons = new Select(selectExitReason);
        reasons.selectByIndex(2);
    }

}
