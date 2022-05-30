package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramePage {
    private WebDriver driver;
    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="frame-top")
    private WebElement frameTop;

    @FindBy (name="frame-left")
    private WebElement leftFrame;

    @FindBy (name = "frame-bottom")
    private WebElement bottomFrame;

    @FindBy (tagName = "body")
    private WebElement bodyTxt;

    public String GetTextLeftFrame(){
        SwitchToTopFrame();
        driver.switchTo().frame(leftFrame);
        String Text = bodyTxt.getText();
        SwitchToMainArea();
        SwitchToMainArea();
        return Text;
    }

    public String GetTextBottomFrame(){
        SwitchToBottomFrame();
        String Text = bodyTxt.getText();
        SwitchToMainArea();
        return Text;

    }

    public void SwitchToTopFrame(){
        driver.switchTo().frame(frameTop);
    }

    public void SwitchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }
    public void SwitchToMainArea(){
        driver.switchTo().parentFrame();
    }


}
