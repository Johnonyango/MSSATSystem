package com.mssTest.pageObjects.member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewMemberRegistration {
    WebDriver localDriver;




    public NewMemberRegistration(WebDriver remoteDriver){
        this.localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }


}
