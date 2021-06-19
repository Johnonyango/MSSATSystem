package com.mssTest.testCases;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.Projections;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_Projections_004 extends BaseClass{
    @Test
    public void calculateProjection() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setTxtEmail(email);
        loginPage.setTxtPassword(password);
        loginPage.clickSubmit();

        Thread.sleep(3000);


        Projections projections = new Projections(driver);

//        projections.clickMenu();
//        try {
            projections.clickProjections();
            logger.info("Land on the projections home page");

            projections.enterInvestmentRate(10);
            projections.enterInflationRate(16);
            projections.enterSalaryRate(15);
            projections.enterAge(57);
            projections.enterProjectionAvc(3000);
            projections.enterTargetMonthlyPension(5000);

        Thread.sleep(3000);
        projections.calculateProjection();
//        }catch (Exception e){
//            System.out.println("no element found");
//        }
    }

}
