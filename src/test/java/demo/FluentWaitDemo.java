package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
//import java.util.function.Function;

import static java.util.concurrent.TimeUnit.*;

public class FluentWaitDemo {
    public static void main(String[] args) {

    }

    public static void seleniumFluentWaitDemo() throws Exception {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Thread.sleep(3000);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement poisk = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));

        driver.findElement(By.name("btnK")).click();

        //CHECK FluentWait AND API DOCUMENTATION

//        FluentWait<WebDriver> webDriverFluentWait = new FluentWait<WebDriver>(driver);
//        webDriverFluentWait.withTimeout(30, SECONDS);
//        webDriverFluentWait.pollingEvery(5, SECONDS);
//        Wait<WebDriver> wait2 = webDriverFluentWait.ignoring(NoSuchElementException.class);
//
//
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.id("foo"));
//            }
//        });

        driver.findElement(By.name("abcd")).click();
        driver.close();
    }
}
