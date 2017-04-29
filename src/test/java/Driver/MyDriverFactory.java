package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class MyDriverFactory {
    /*public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        switch (property) {

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "Lib\\chromedriver.exe");
                return new ChromeDriver();

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
                return new FirefoxDriver();

            default:
                System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
                return new FirefoxDriver();


        }
    }*/

    public static WebDriver getDriver() {
        String property = System.getProperty("driver");
        WebDriver driver = null;
        String nameDriver = System.getProperty("driver");
        if (nameDriver != null) {
            switch (nameDriver) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "Lib\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
                    driver = new FirefoxDriver();
                case "ie":
                    System.setProperty("webdriver.ie.driver", "Lib\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", "Lib\\MicrosoftWebDriver.exe");
                    driver = new EdgeDriver();
                    break;

            }
        } else {

            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
