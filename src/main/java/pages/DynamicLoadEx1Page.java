package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadEx1Page {
    private WebDriver driver;
    public DynamicLoadEx1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#start button")    //@FindBy (xpath = "//*[@id=\"start\"]/button")
    private WebElement startBtn;

    @FindBy (id = "loading")
    private WebElement loading;

    @FindBy (id = "finish")
    private WebElement Text;



    public void ClickStartBtn(){
        startBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(loading));
    }

    public String GetLoadedText(){
        return Text.getText();
    }

}
