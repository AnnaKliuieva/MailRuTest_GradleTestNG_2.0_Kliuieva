package Tests;

import Steps_or_Features.AfterLoginStep;
import Steps_or_Features.CommonSteps;
import Steps_or_Features.LoginStep;

/**
 * Created by Anna on 29.04.2017.
 */
public class MyApplication {

    final LoginStep login = new LoginStep();
    final AfterLoginStep afterlogin = new AfterLoginStep();
    final CommonSteps common = new CommonSteps();
}
