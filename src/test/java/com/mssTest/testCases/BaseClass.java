package com.mssTest.testCases;

import com.mssTest.utilities.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    ReadConfig readConfig = new ReadConfig();

    public String baseUrl = readConfig.getApplicationUrl();
    public String email = readConfig.getUserName();
    public String password = readConfig.getPassword();


    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br){
//        logger = Logger.getLogger("");
//        PropertyConfigurator.configure("Log4j.properties");
        if (br.equals("chrome")){
            System.setProperty("webdriver.gecko.driver", readConfig.getGeckoDriverPath());
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }else if (br.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", readConfig.getGeckoDriverPath());
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

//    @AfterClass
    public void teardown(){
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
        FileUtils.copyFile(source,target);
        System.out.println("Screenshot taken");
    }
}
