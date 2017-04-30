package Page;

import Driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected static final WebDriver driver = new MyDriver();
    protected final String BASE_URL = "http://mail.ru";


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
