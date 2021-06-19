package com.mssTest.pageObjects;

import com.mssTest.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MakeContribution{

    WebDriver localDriver;

    public MakeContribution(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//button[@class='x-button-el']")
    WebElement buggerMenu;

    @FindBy(linkText = "Contributions")
    WebElement contributionsBtn;

    @FindBy(id = "ext-element-508")
    WebElement makeContribution;
}
