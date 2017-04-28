package Tests;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class BaseTest {
    protected WebDriver driver;
    final String BASE_URL = "http://mail.ru";

    @BeforeSuite
    public void beforeSuite() throws Exception {
        driver = MyDriverFactory.getDriver();
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        driver.quit();
    }
}
