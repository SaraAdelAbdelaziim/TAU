package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "a[href=\"/dynamic_loading/1\"]")
    private WebElement dynamicLoadEx1Page;

    @FindBy (css= "a[href=\"/dynamic_loading/2\"]")
    private WebElement dynamicLoadEx2Page;


    public DynamicLoadEx1Page OpenEx1Page(){
        dynamicLoadEx1Page.click();
        return new DynamicLoadEx1Page(driver);
    }

    public DynamicLoadEx2Page OpenEx2Page(){
        dynamicLoadEx2Page.click();
        return new DynamicLoadEx2Page(driver);
    }

    public DynamicLoadEx2Page OpenEx2Link(){
        dynamicLoadEx2Page.sendKeys(Keys.CONTROL,Keys.ENTER);
        return new DynamicLoadEx2Page(driver);
    }
}
