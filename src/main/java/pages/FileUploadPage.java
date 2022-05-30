package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="file-upload")
    private WebElement chooseFileBtn;

    @FindBy (id="file-submit")
    private WebElement uploadFileBtn;

    @FindBy (id="uploaded-files")
    private WebElement uploaditem;

    public void UploadFile(String text){
        chooseFileBtn.sendKeys(text);
        uploadFileBtn.click();
    }

    public String GetUploadedFile(){
        return uploaditem.getText();
    }





}
