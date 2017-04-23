package Tests;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class MyTest extends BaseTest {
    LoginPage loginPage;

    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage = new LoginPage(driver);


    }

    /* @DataProvider(name = "myDateProvider")
        public static Object[][] Name() {
            return new Object[][] {{"http://mail.ru"},
                    {"http://korrespondent.net/"}};
        }
        */
   /* @Test(invocationCount = 3)
    public void test1() throws Exception {
        driver.get("http://korrespondent.net/");

    }

    @Test(invocationTimeOut = 1000)
    public void testTimeOut() throws Exception {
       // Thread.sleep(2000);
        Assert.assertFalse(false);

    }

    @Test(dependsOnMethods = {"changeuserpass", "changelogin"}, alwaysRun = false)
    public void trytolog() throws Exception {
        System.out.println("change user pass");

    }

    @Test
    public void changeuserpass() throws Exception {
        System.out.println("change password");
    }
*/
   /* @Test(description = "Test Test")
    public void changelogin() throws Exception {
        System.out.println("change login");
        // Assert.assertTrue(false);

    }

    @Test(dataProvider = "myDateProvider")
    public void test3(String url) throws Exception {
        driver.get(url);
        //Assert.assertFalse(true);

    }
*/
    @Test(description = "Login Test")
    public void testTest() throws Exception {
        /*System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        System.out.println(driver.getWindowHandles());
*/

       // driver.get("http://selenium2.ru");
       String actual = loginPage.login("mytest_test", "337774a").getMailUser();
        Assert.assertEquals(actual, "mytest_test@mail.ru", "Error");


    }
}
