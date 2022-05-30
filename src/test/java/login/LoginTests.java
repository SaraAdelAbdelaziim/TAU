package login;
import base.BaseTestWithEventListener;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.LoginPage;


public class LoginTests extends BaseTests {

    @Test
    public void TestSuccessfulLogin(){
        LoginPage loginpage =  homepage.OpenLoginPage();
        loginpage.EnterDate("tomsmith","SuperSecretPassword!");
        AuthenticationPage auth = loginpage.login();
        String Confirmation = "You logged into a secure area!";
        Assert.assertTrue(auth.ConfirmMessg().contains(Confirmation));
    }
}
