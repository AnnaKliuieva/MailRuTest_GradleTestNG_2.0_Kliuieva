package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Anna on 27.04.2017.
 */
public class SendLetterPage extends AfterLoginPage {

    public SendLetterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "div/textarea[@data-original-name=\"To\"]")
    private WebElement fieldTO;

    @FindBy(xpath = "div/input[@name=\"Subject\"]")
    private WebElement fieldSubject;

    @FindBy(id = "tinymce")
    private WebElement fieldLetterContent;


    @FindBy(xpath = "div[@data-name=\"send\"]/span[@class=\"b-toolbar__btn__text\"]")
    private WebElement sendButton;

    public AfterLoginPage sendLetter(String email, String subject, String letterContent) throws InterruptedException {
        fieldTO.sendKeys(email);
        fieldSubject.sendKeys(subject);
        fieldLetterContent.sendKeys(letterContent);
        sendButton.submit();
        Thread.sleep(15000);
        return new AfterLoginPage(driver);
    }
}
