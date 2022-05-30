package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
    private WebDriver driver;
    private Actions action;
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    @FindBy (id="hot-spot")
    private WebElement box;

    public void ClickTheBox(){
        action.contextClick(box).perform();
    }

    public void alert_confirm(){
        driver.switchTo().alert().accept();
    }

    public String alert_getMesg(){
        return driver.switchTo().alert().getText();
    }

}
