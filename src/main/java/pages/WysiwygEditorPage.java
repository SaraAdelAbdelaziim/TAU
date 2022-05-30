package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WysiwygEditorPage {
    private WebDriver driver;
    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "mce_0_ifr")
    private WebElement editorFrame;

    @FindBy (id = "tinymce")
    private WebElement textArea;

    @FindBy (css = "button[title=\"Decrease indent\"]")
    private WebElement decreaseIndentBtn;

    public void ClearTextArea(){
        SwitchToFrame();
        textArea.clear();
        SwitchToMainArea();
    }

    public void SetTextArea(String Text){
        SwitchToFrame();
        textArea.sendKeys(Text);
        SwitchToMainArea();
    }

    public String GetText(){
        SwitchToFrame();
        String Text= textArea.getText();
        SwitchToMainArea();
        return Text;
    }

    public void ClickDecreaseBtn(){
        decreaseIndentBtn.click();
    }

    public void SwitchToFrame(){
        driver.switchTo().frame(editorFrame);
    }

    public void SwitchToMainArea(){
        driver.switchTo().parentFrame();
    }


}

