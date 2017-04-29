package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {


    // AfterLoginPage afterLoginPage;
    // SendLetterPage sendLetterPage;


    @Test(description = "Login Test")
    public void testTest() throws Exception {

        app.login.login("mytest_test", "337774a");
        Assert.assertEquals(app.afterlogin.getMailUser(), "mytest_test@mail.ru", "Error");

    }


    @Test(description = "SendLetter Test", dependsOnMethods = {"testTest"}, alwaysRun = true)
    public void sendLetterTest() throws Exception {
        String actual = app.afterlogin.writeLetter().
                sendLetter("mytest_test@mail.ru", "testKliuieva").
                checkInbox().getSubjectContent();
        //sendLetterPage.sendLetter("mytest_test@mail.ru", "testKliuieva", "Nu, s Bogom");
        //String actual = afterLoginPage.checkInbox().getSubjectContent();
        Assert.assertEquals(actual, "testKliuieva-- test MyTest", "Error");

    }
}
