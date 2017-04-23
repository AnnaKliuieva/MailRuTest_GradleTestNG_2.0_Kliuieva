package Tests;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.io.File;

/**
 * Created by Anna on 08.04.2017.
 */
public class BaseTest {
    protected WebDriver driver;
    final String BASE_URL = "http://mail.ru";

    @BeforeSuite
    public void beforeSuite() throws Exception {
       /* //System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "Lib\\chromedriver.exe");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
*/
     /*  System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
       System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
      //  FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Firefox Developer Edition\\firefox.exe"));
       // FirefoxProfile profile = new FirefoxProfile();
        FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\Anna\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\j5m5pkx5.default"));
       // FirefoxDriver driver = new FirefoxDriver(binary, profile);
        FirefoxDriver driver = new FirefoxDriver(profile);
*/
     /*   System.setProperty("webdriver.ie.driver", "Lib\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
*/
        driver = MyDriverFactory.getDriver();
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        driver.quit();
    }
}
