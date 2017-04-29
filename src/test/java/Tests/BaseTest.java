package Tests;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import javax.management.InvalidApplicationException;


public class BaseTest {
    protected MyApplication app;

    @BeforeSuite
    public void beforeSuite() throws Exception {
        app = new MyApplication();
        app.common.startDriver();
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        app.common.stopDriver();

    }
}
