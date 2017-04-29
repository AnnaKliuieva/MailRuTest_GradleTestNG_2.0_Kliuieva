package Page;

import Driver.MyDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected static final WebDriver driver = MyDriverFactory.getDriver();
    protected final String BASE_URL = "http://mail.ru";


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
