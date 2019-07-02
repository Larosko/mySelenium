package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumWaitDemo {
    public static void main(String[] args) throws Exception {
        seleniumWaits();
    }
    private static void seleniumWaits()throws Exception{
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement poisk = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
//        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();

//        String myGoCookies = driver.manage().getCookies().toString();
//        System.out.println(myGoCookies);

        driver.findElement(By.name("abcd")).click();
        driver.close();

    }
}
