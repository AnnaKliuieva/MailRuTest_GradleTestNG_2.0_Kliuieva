package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anna on 02.04.2017.
 */
public class AfterLoginPage extends BasePage {
   /* public AfterLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }*/

    public AfterLoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "PH_user-email")
    private WebElement userLoginEmail;

    public String getMailUser() {
        return userLoginEmail.getText();
    }
}
