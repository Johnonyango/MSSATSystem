package com.mssTest.testCases.pensioner;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.testCases.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_PensionerLoginTest_001 extends BaseClass {

    @Test
    public void login() throws IOException {
        logger.info("url opened");

        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail(email);
        logger.info("Entered username");

        loginPage.setTxtPassword(password);
        logger.info("Entered password");

        loginPage.clickSubmit();
        logger.info("clicked login button");
//        System.out.println(driver.getTitle().equals("MSS Portal"));


        boolean isTitle = driver.getTitle().equals("MSS Portal");

        if(isTitle)
        {
            Assert.assertTrue(true);
            logger.info("==================Login test passed!");
        }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login test failed!");
        }



    }
}
