package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "mailbox__login")
    private WebElement name;

    @FindBy(id = "mailbox__password")
    private WebElement password_;

    @FindBy(id = "mailbox__auth__button")
    private WebElement authButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public AfterLoginPage login(String name, String password) throws InterruptedException {
        this.name.sendKeys(name);
        password_.sendKeys(password);
        authButton.submit();
        Thread.sleep(15000);
        return new AfterLoginPage(driver);
    }
}
