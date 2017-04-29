package Steps_or_Features;

import Page.BasePage;

/**
 * Created by Anna on 29.04.2017.
 */
public class CommonSteps extends BasePage {

    public void startDriver(){
        driver.get(BASE_URL);
    }

    public void stopDriver(){
        driver.quit();
    }
}
