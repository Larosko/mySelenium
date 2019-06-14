package org.seleniumhq.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_testNG {

    WebDriver driver = null;

    @BeforeTest
    public void setUpTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.gecko.driver", "C:\\Dasha's projects\\fireFox driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        Thread.sleep(3000);

    }



    @Test
    public void googleSearch() throws InterruptedException {
        String appUrl = "http://www.google.com";
        driver.get(appUrl);
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("Madonna");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDownTest() {
        //close driver
        driver.close();
        System.out.println("успех");
    }
}
