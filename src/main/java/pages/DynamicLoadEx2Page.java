package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadEx2Page {
    private WebDriver driver;
    public DynamicLoadEx2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#start button")    //@FindBy (xpath = "//*[@id=\"start\"]/button")
    private WebElement startBtn;

    @FindBy (id = "loading")
    private WebElement loading;

    @FindBy (id = "finish")
    private WebElement Text;



    public void ClickStartBtn(){
        startBtn.click();
    }

    public String GetLoadedText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Text));
        return Text.getText();
    }

    public boolean IsStartBtnVisible(){
        return startBtn.isDisplayed();
    }




}
