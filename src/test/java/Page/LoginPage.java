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

    protected void setName(String name) {
        this.name.sendKeys(name);
    }

    protected void setPassword(String password) {
        password_.sendKeys(password);
    }

    protected void authButtonClick() throws InterruptedException {
        authButton.submit();
        Thread.sleep(5000);
    }
}
