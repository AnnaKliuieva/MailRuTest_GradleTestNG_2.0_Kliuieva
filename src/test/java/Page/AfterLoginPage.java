package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;


public class AfterLoginPage extends BasePage {

    public AfterLoginPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "PH_user-email")
    private WebElement userLoginEmail;

    @FindBy(xpath = "div/a[@class =\"mts35-nY\" and @href=\"/messages/inbox/\"]")
    private WebElement inbox;

    //@FindBy(xpath = "//*[contains(text(),"Написать письмо")]")
    @FindBy(xpath = "//div[@id=\"etQax-c6\"]//a//span[@class=\"b-toolbar__btn__text b-toolbar__btn__text_pad\"]")
    private WebElement writeLetterButton;

    @FindBy(xpath = "//div[@class=\"mts35-f9\"]//a//div[@class=\"b-datalist__item__subj\"]")
    private WebElement icomingMessage;

    public String getMailUser() {
        return userLoginEmail.getText();
    }

    public SendLetterPage writeLetter() {
        writeLetterButton.submit();
        return new SendLetterPage(driver);
    }

    public AfterLoginPage checkInbox() {
        inbox.submit();
        return new AfterLoginPage(driver);
    }

    public String getSubjectContent() {
        return icomingMessage.getText();
    }

}
