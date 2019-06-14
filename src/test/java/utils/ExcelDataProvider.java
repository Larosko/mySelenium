package utils;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

//    public static void main(String[] args) {
//        String projectPath = System.getProperty("user.dir");
//        String excelPath = "\\excel\\data.xlsx";
//        String sheetName = "Tabelle1";
//        testData(projectPath+ excelPath, sheetName);
//    }

    private WebDriver driver = null;

    @BeforeTest
    public void setUpTest() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.gecko.driver", "C:\\Dasha's projects\\fireFox driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        Thread.sleep(3000);
    }

    @Test(dataProvider = "test1data")
    public void test1(String username, String password) throws InterruptedException {
        System.out.println(username + "  |  " + password);
        driver.get("https://vk.com");
        Thread.sleep(3000);
        driver.findElement(By.id("index_email")).sendKeys(username);
        driver.findElement(By.id("index_pass")).sendKeys(password);
    }

    @DataProvider(name="test1data")
    public Object[][] getData(){
        String projectPath = System.getProperty("user.dir");
        String excelPath = "\\excel\\data.xlsx";
        return testData(projectPath+ excelPath, "Tabelle1");

    }
    public static Object[][] testData(String excelPath, String sheetName){
        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

        int rowCount = excel.countRows();
        int colCount = excel.countCols();

        Object[][] data = new Object[rowCount - 1][colCount];

        for(int i=1; i<rowCount; i++){
            for(int j=0; j<colCount; j++){
                String cellData = excel.getCellDataString(i,j);
//                System.out.println(cellData);
                data[i-1][j] = cellData;
            }
        }
        return data;
    }
}
