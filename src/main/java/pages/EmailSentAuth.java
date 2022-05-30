package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailSentAuth {
    private WebDriver driver;
    public EmailSentAuth(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy ()
    private WebElement confMesg;

    public void getMesg(){
        confMesg.getText();
    }

}
