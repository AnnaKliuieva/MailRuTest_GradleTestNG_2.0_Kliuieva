package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Anna on 02.04.2017.
 */
public class LoginPage extends BasePage {
    // WebDriver driver;

    @AndroidFindBy

    @FindBy(id = "mailbox__login")
    private WebElement name;

    @FindBy(id = "mailbox__password")
    private WebElement password_;

    @FindBy(id = "mailbox__auth__button")
    private WebElement authButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

   /*public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
   */

    public AfterLoginPage login(String name, String password) throws InterruptedException {
        //Thread.sleep(5000);
        // new WebDriverWait(driver, 10);
        //new WebDriverWait(driver, 20);
        //new WebDriverWait(driver, 30);
        this.name.sendKeys(name);
        password_.sendKeys(password);
        authButton.submit();
        Thread.sleep(15000);
        return new AfterLoginPage(driver);
    }
}
