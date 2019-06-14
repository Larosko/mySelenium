package org.seleniumhq.selenium;
/**
 * Created by Dasha on 06.06.2019.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class My_selenium_learning {
    public static void main(String[] args) throws IOException {

        //System.setProperty("webdriver.gecko.driver", "C:\\Dasha's projects\\fireFox driver\\geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // Open ToolsQA web site
        String appUrl = "http://www.DemoQA.com";
        driver.get(appUrl);

        // Click on Registration link
        driver.findElement(By.linkText("Tooltip")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Go back to Home Page
        driver.navigate().back();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Go forward to Registration page
        driver.navigate().forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Go back to Home page
        driver.navigate().to(appUrl);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh browser
        driver.navigate().refresh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Close browser
        driver.quit();
    }
}

