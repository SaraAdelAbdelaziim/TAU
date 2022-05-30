package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetpasswordPage {

    private WebDriver driver;
    public ForgetpasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="email")
    private WebElement email;

    @FindBy (id="form_submit")
    private WebElement button;

    public void enterEmail(String emailAddress){
        email.sendKeys(emailAddress);
    }

    public EmailSentAuth EmailSent(){
        button.click();
        return new EmailSentAuth(driver);
    }


}
