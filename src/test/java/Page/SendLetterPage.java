package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Anna on 27.04.2017.
 */
public class SendLetterPage extends AfterLoginPage {


    @FindBy(xpath = "//div/textarea[@data-original-name=\"To\"]")
    private WebElement fieldTo;

    @FindBy(xpath = "//div/input[@name=\"Subject\"]")
    private WebElement fieldSubject;

    @FindBy(xpath = ".//*[@id=\"tinymce\"]")
    private WebElement fieldLetterContent;


    @FindBy(xpath = "//div[@data-name=\"send\"]/span[@class=\"b-toolbar__btn__text\"]")
    private WebElement sendButton;

    public AfterLoginPage sendLetter(String email, String subject) throws InterruptedException {
        fieldTo.sendKeys(email);
        fieldSubject.sendKeys(subject);
       // fieldLetterContent.sendKeys(letterContent);   String letterContent
        sendButton.click();
        Thread.sleep(5000);
        return new AfterLoginPage();
    }
}
