package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="username")
    private WebElement User;
    @FindBy (id="password")
    private WebElement Password;
    @FindBy (className = "radius")
    private WebElement SubmitButt;

    public void EnterDate(String UserName, String password){
        User.sendKeys(UserName);
        Password.sendKeys(password);

    }

    public AuthenticationPage login(    ){
        SubmitButt.click();
        return new AuthenticationPage (driver);
    }


}
