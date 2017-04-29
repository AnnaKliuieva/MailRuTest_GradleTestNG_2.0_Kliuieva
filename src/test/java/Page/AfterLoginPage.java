package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;


public class AfterLoginPage extends BasePage {

    @FindBy(id = "PH_user-email")
    protected WebElement userLoginEmail;

    @FindBy(xpath = ".//*[@id='b-nav_folders']/div/div[1]/a/span[2]")
    private WebElement inbox;

    @FindBy(xpath = ".//*[@id='b-toolbar__left']/div/div/div[2]/div/a/span")
    private WebElement writeLetterButton;

    @FindBy(xpath= ".//*[@id='b-letters']/div/div[2]/div/div[2]/div[1]/div/a/div[4]/div[3]/div[1]/div")
    private WebElement incomingMessage;



    public SendLetterPage writeLetter() {
        writeLetterButton.click();//(submit  dlia podtvergdeniia formy )
        return new SendLetterPage();
    }

    public AfterLoginPage checkInbox() {
        inbox.click();
        return new AfterLoginPage();
    }

    public String getSubjectContent() {
        return incomingMessage.getText();
    }

}
