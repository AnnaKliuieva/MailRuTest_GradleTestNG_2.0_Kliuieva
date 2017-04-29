package Steps_or_Features;

import Page.LoginPage;
import org.apache.log4j.Logger;

/**
 * Created by Anna on 29.04.2017.
 */
public class LoginStep extends LoginPage {
    Logger logger = Logger.getLogger("LoginStep");


    public AfterLoginStep login(String name, String password) throws InterruptedException {
        setName(name);
        setPassword(password);
        logger.info(String.format("log User_name - %s  password - %s", name, password));
        authButtonClick();
        return new AfterLoginStep();
    }
}
