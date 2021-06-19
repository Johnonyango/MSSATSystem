package com.mssTest.testCases.admin;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.pageObjects.pensioner.ViewPermissions;
import com.mssTest.testCases.BaseClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_AdminPermissions_001 extends BaseClass {

    @Test
    public void viewPermissions() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);

//        loginPage.waitPage();

        loginPage.setTxtEmail("j.yayah7@gmail.com");
//        logger.info("Entered username");

        loginPage.setTxtPassword("Admin@123");
//        logger.info("Entered password");

        loginPage.clickSubmit();



        ViewPermissions viewPermissions = new ViewPermissions(driver);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        try {

//        }catch (Exception e){
//            System.out.println("element not found");
//        }

//        WebElement personalDetails = driver.findElement(By.xpath("//h3[contains(text(),'Pensioner Details')]"));
//         if (personalDetails.isDisplayed()){
//             Assert.assertTrue(true);
//             logger.info("View personal details success");
//             System.out.println("test passes");
//         }else {
//             captureScreen(driver, "viewPermissions");
//             Assert.assertTrue(false);
//             logger.info("View personal details failed");
//             System.out.println("test fails");
//         }
        viewPermissions.viewPersonalInfo();
        Thread.sleep(5000);
        viewPermissions.viewPayrolls();
        logger.info("View personal info success");
        Thread.sleep(5000);
        viewPermissions.viewDeductions();
        logger.info("View deductions info success");
        Thread.sleep(5000);
        viewPermissions.viewCOE();
        logger.info("View certificates success");
        Thread.sleep(5000);
        viewPermissions.viewLogs();
        logger.info("View activity logs success");
        Thread.sleep(5000);
        viewPermissions.viewTickets();
        logger.info("View tickets success");
        Thread.sleep(5000);
//        viewPermissions.clickManageAccount();
//        logger.info("View visit manage account page success");
//        Thread.sleep(5000);
        viewPermissions.returnHome();
        logger.info("View personal info success");
        Thread.sleep(5000);

        try {
            viewPermissions.changePassword();
            logger.info("Change password successful");
        }catch (Exception e){
            System.out.println("element not found");
            logger.warn("Change password not successful");
            captureScreen(driver, "viewPermissions");
        }
    }
}
