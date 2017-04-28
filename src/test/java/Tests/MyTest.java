package Tests;

import Page.AfterLoginPage;
import Page.LoginPage;
import Page.SendLetterPage;
import org.testng.Assert;
import org.testng.annotations.*;


public class MyTest extends BaseTest {
    LoginPage loginPage;
    AfterLoginPage afterLoginPage;
   // SendLetterPage sendLetterPage;

    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Login Test")
    public void testTest() throws Exception {
        String actual = loginPage.login("mytest_test", "337774a").getMailUser();
        Assert.assertEquals(actual, "mytest_test@mail.ru", "Error");
    }

    @Test(description = "SendLetter Test", dependsOnMethods ={"testTest"}, alwaysRun = true)
    public void sendLetterTest() throws Exception {
        afterLoginPage = new AfterLoginPage(driver);
        String actual = afterLoginPage.writeLetter().
                sendLetter("mytest_test@mail.ru", "testKliuieva", "Nu, s Bogom").
                checkInbox().getSubjectContent();
        //sendLetterPage.sendLetter("mytest_test@mail.ru", "testKliuieva", "Nu, s Bogom");
        //String actual = afterLoginPage.checkInbox().getSubjectContent();
        Assert.assertEquals(actual, "testKliuieva", "Error");

    }
}
