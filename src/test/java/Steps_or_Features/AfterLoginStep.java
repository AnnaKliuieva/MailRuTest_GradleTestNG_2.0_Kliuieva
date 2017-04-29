package Steps_or_Features;

import Page.AfterLoginPage;

/**
 * Created by Anna on 29.04.2017.
 */
public class AfterLoginStep extends AfterLoginPage {

    public String getMailUser() {
        return userLoginEmail.getText();
    }
}
