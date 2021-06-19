package com.mssTest.testCases;

import com.mssTest.pageObjects.ClaimProcessing;
import com.mssTest.pageObjects.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_ClaimProcessing_005 extends BaseClass{

    @Test
    public void claimProcessing() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setTxtEmail(email);
        loginPage.setTxtPassword(password);
        loginPage.clickSubmit();

        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        ClaimProcessing cp = new ClaimProcessing(driver);

        cp.clickClaimsBtn();
        cp.clickInitiateClaimBtn();
        cp.clickProceedBtn();
        cp.validateStepOne();
//        cp.clickReasonBox();
//        cp.selectReason();


    }
}
