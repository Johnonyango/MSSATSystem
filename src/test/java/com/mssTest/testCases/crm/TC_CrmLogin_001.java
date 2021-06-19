package com.mssTest.testCases.crm;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.testCases.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Crm_AdminLogin_001 extends BaseClass {


    public class TC_LoginTest_001 extends BaseClass {

        @Test
        public void login() throws IOException {
//        logger.info("url opened");

            LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

            loginPage.setTxtEmail("smnkimathi@gmail.com");
//        logger.info("Entered username");

            loginPage.setTxtPassword("Admin@123");
//        logger.info("Entered password");

            loginPage.clickSubmit();
//        logger.info("clicked login button");
//        System.out.println(driver.getTitle());


            if (driver.getTitle().contains("MSS")) {
                Assert.assertTrue(true);
//            logger.info("login test passed");
            } else if (!driver.getTitle().contains("Mss")) {
                Assert.assertTrue(false);
                captureScreen(driver, "loginTest");
//            logger.info("Login test failed");
            }
        }
    }
}