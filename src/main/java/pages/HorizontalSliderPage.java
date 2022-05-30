package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {
    private WebDriver driver;
    private Actions action;
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
         action= new Actions(driver);
    }


    @FindBy (css="input[type=\"range\"]")
    private WebElement slider;

    @FindBy (id="range")
    private WebElement SliderText;

    public void manageSlider(String value){
        while(!GetSliderText().equals(value)){
        slider.sendKeys(Keys.ARROW_RIGHT);}
    }

    public String GetSliderText(){
        return SliderText.getText();
    }
}
