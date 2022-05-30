package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentAuth;
import pages.ForgetpasswordPage;

public class ForgetPassTests extends BaseTests {

    @Test
    public void forgetpassTest(){

        ForgetpasswordPage forgetpass = homepage.OpenForgetPasswordPage();
        forgetpass.enterEmail("tau@example.com");
        EmailSentAuth emailAuth = forgetpass.EmailSent();

        String mesg = "";

    }
}
