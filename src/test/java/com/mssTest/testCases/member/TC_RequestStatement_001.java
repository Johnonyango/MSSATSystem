package com.mssTest.testCases;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.RequestStatement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_RequestStatement_001 extends BaseClass{

    @Test
    public void requestStatement() throws InterruptedException {
        RequestStatement requestStatement = new RequestStatement(driver);
        driver.get(baseUrl);

        LoginPage loginPage = new LoginPage(driver);


        loginPage.setTxtEmail(email);
//        logger.info("Entered username");

        loginPage.setTxtPassword(password);
//        logger.info("Entered password");

        loginPage.clickSubmit();

        requestStatement.makeReRequest();
//        requestStatement.submitRequest();

    }

}
