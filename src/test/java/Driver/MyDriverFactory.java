package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyDriverFactory {
    public static WebDriver getDriver() {
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
    }
}
