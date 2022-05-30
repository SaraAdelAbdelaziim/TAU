package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaAlertPage {
    private WebDriver driver;
    public JavaAlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//button[@onclick=\"jsAlert()\"]")
    private WebElement JsAlertBtn;

    @FindBy (id="result")
    private WebElement alertTask;

    @FindBy (xpath = "//button[@onclick=\"jsConfirm()\"]")
    private WebElement JsConfirmBtn;

    @FindBy (xpath = "//button[@onclick=\"jsPrompt()\"]")
    private WebElement JsPromptBtn;


    public void alert_ClickOnJsAlert(){
        JsAlertBtn.click();
    }

    public void alert_ClickOnJsConfirm(){
        JsConfirmBtn.click();
    }

    public void alert_ClickOnJsPrompt(){
        JsPromptBtn.click();
    }

    public void alert_accept(){
        driver.switchTo().alert().accept();
    }

    public void alert_dismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_sendKeys(String Text){
         driver.switchTo().alert().sendKeys(Text);
    }


    public String getText(){
        return alertTask.getText();
    }



}
