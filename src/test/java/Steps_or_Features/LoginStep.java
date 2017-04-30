package Steps_or_Features;

import Page.LoginPage;
import org.apache.log4j.Logger;
import User.User;

/**
 * Created by Anna on 29.04.2017.
 */
public class LoginStep extends LoginPage {
    Logger logger = Logger.getLogger("LoginStep");


    public AfterLoginStep login(User user ) throws InterruptedException {
        setName(user.login);
        setPassword(user.password);
        logger.info(String.format("log User_name - %s  password - %s", user.login, user.password));
        authButtonClick();
        return new AfterLoginStep();
    }
}
