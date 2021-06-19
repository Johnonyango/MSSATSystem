package com.mssTest.pageObjects;

import com.mssTest.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Projections{
    WebDriver localDriver;




    public Projections(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//button[@id='ext-element-36']")
    WebElement buggerMenu;

    @FindBy(xpath = "//div[@id='ext-element-60']")
    WebElement projections;

    @FindBy(name = "returnRate")
    @CacheLookup
    WebElement futureInvestmentRate;

    @FindBy(name = "inflationRate")
    @CacheLookup
    WebElement inflationrate;

    @FindBy(name = "salaryEscalationRate")
    @CacheLookup
    WebElement salaryEscalationRate;

    @FindBy(name = "ageAtExit")
    @CacheLookup
    WebElement ageAtExit;

    @FindBy(name = "projectedAvc")
    @CacheLookup
    WebElement projectedAvc;

    @FindBy(name = "targetMonthlyPension")
    @CacheLookup
    WebElement monthlyPension;

    @FindBy(xpath = "//*[contains(@data-componentid,'memberCalculateProjection')]")
    @CacheLookup
    WebElement calculateBtn;

    public void clickMenu(){
        buggerMenu.click();
    }

    public void clickProjections(){

//        Actions builder = new Actions(localDriver);
//        Action seriesOfActions = builder
//                .moveToElement(projections)
//                .click()
//                .build();
//        seriesOfActions.perform();
        projections.click();
    }

    public void enterInvestmentRate(int returnRate){

//        Actions builder = new Actions(localDriver);
//        Action seriesOfActions = builder
//                .moveToElement(futureInvestmentRate)
//                .sendKeys(String.valueOf(returnRate))
//                .build();
//        seriesOfActions.perform();
        futureInvestmentRate.sendKeys(String.valueOf(returnRate));
    }
    public void enterInflationRate(int rate){
        inflationrate.sendKeys(String.valueOf(rate));

    }public void enterSalaryRate(int salary){
        salaryEscalationRate.sendKeys(String.valueOf(salary));

    }public void enterAge(int age){
        ageAtExit.sendKeys(String.valueOf(age));

    }public void enterProjectionAvc(int projectionavc){
        projectedAvc.sendKeys(String.valueOf(projectionavc));

    }public void enterTargetMonthlyPension(int monthlypension){
        monthlyPension.sendKeys(String.valueOf(monthlypension));

        localDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }public void calculateProjection(){
        localDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//        Actions builder = new Actions(localDriver);
//        Action seriesOfActions = builder
//                .moveToElement(calculateBtn)
//                .click()
//                .build();
//        seriesOfActions.perform();
        calculateBtn.click();
    }

}
