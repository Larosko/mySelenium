package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

    private WebDriver driver = null;

    @Parameters("browserName")
    @BeforeTest
    public void setup(String browserName){
        System.out.println("Browser Name is: " + browserName);
        System.out.println("Thread Id is: " + Thread.currentThread().getId());
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
    }

    @Test
    public void test1()throws Exception{
        driver.get("https://google.com");
        Thread.sleep(2000);
    }

    @AfterTest
    public void teardown(){
        driver.close();
        System.out.println("Test completed successfully");
    }
}
