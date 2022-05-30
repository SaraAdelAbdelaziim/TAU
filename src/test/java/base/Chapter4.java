package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;

public class Chapter4 {
    public WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();

    }

    public static void main(String[] args) {
        Chapter4 test = new Chapter4();
        test.setup();
        HomePage homepage = new HomePage(test.driver);
        LoginPage loginpage = new LoginPage(test.driver);
        AuthenticationPage auth = new AuthenticationPage(test.driver);

        homepage.OpenLoginPage();
        loginpage.EnterDate("tomsmith","SuperSecretPassword!");
        loginpage.login();
        String Confirmation = "You logged into a secure area!";
        Assert.assertTrue(auth.ConfirmMessg().contains(Confirmation));
        test.driver.quit();
    }
}
