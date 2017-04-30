package Tests;

import User.User;
import User.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest extends BaseTest {

    @Test(description = "Login Test")
    public void testTest() throws Exception {

        User validUser = UserFactory.getValidUser();
        app.login.login(validUser);
        Assert.assertEquals(app.afterlogin.getMailUser(), validUser.mail, "Error");

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
