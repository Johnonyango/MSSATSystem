package com.mssTest.testCases;

import com.mssTest.pageObjects.LoginPage;
import com.mssTest.testCases.BaseClass;
import com.mssTest.utilities.XLUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_LoginDDT_002 extends BaseClass {

    @Test(dataProvider = "LoginData")
    public void loginDDT(String username, String pwd) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setTxtEmail(username);
        loginPage.setTxtPassword(pwd);
        loginPage.clickSubmit();

        Thread.sleep(3000);

//        if(isAlertPresent()==true)
//        {
//            driver.switchTo().alert().accept();//close alert
//            driver.switchTo().defaultContent();
//            Assert.assertTrue(false);
//            logger.warn("Login failed");
//        }
//        else
//        {
//            Assert.assertTrue(true);
//            logger.info("Login passed");
////            loginPage.clickLogout();
//            Thread.sleep(3000);
//            driver.switchTo().alert().accept();//close logout alert
//            driver.switchTo().defaultContent();
//
//        }
    }

    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }

    @DataProvider(name = "LoginData")
    Object[][] getData() throws IOException {

//        String path = System.getProperty("user.dir") + "/src/test/java/com/mssTest/testData/LoginData.xls";
        String path = "/home/johnte/Projects/MssATSystem/src/test/java/com/mssTest/testData/mssusers.xlsx";
        int rowNo = XLUtils.getRowCount(path, "sheet1");
        int colCount = XLUtils.getCellCount(path, "sheet1", 1);
        String loginData[][] = new String[rowNo][colCount];

        for (int i=1; i<=rowNo; i++){
            for (int j=0; j<colCount; j++){
                loginData[i-1][j] = XLUtils.getCellData(path,"sheet1",i,j);

            }
        }
        return loginData;
    }
}
