package org.seleniumhq.selenium;
/*create by Dasha 07.06.19*/

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtendReportBasicDemo {

    private static WebDriver driver = null;
    static ExtentReports extent;
    static ExtentTest test;

    @BeforeSuite
    public static void setUp() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport3.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    @BeforeTest
    public static void  setUpTest() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public static void test1() throws IOException {
        ExtentTest test = extent.createTest("MyFirstTest", "Sample");
        test.log(Status.INFO, "Starting TC");
        test.info("Info usage");
        test.fail("Pressed Enter", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreencastFromPath("screenshot.png");
    }

    @AfterTest
    public static void tearDownTest() {
        driver.close();
        System.out.println("успех");
    }
    @AfterSuite
    public static void tearDown() {
        extent.flush();
    }
}
