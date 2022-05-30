package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressesPage {
    private WebDriver driver;
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="target")
    private WebElement textbox;
    @FindBy (id="result")
    private WebElement resultmesg;

    public void EnterText(String text){
        textbox.sendKeys(text);
    }

    public String getMesg(){
        return resultmesg.getText();
    }
}
