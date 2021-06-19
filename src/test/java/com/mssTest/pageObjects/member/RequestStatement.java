package com.mssTest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RequestStatement {
    WebDriver localDriver;



    public RequestStatement(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(xpath = "//button[@id='ext-element-83']")
//    @FindBy(xpath = "//button[@id='ext-element-83']")
    WebElement btnStartRequest;

    @FindBy(xpath = "//button[@id='ext-element-613']")
    WebElement btnNextRequest;


    public void makeReRequest(){
        btnStartRequest.click();
    }

//    public void submitRequest(){
//        btnNextRequest.click();
//    }
}
