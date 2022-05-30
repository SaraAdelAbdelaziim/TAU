package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;


public class DropdownPage {

    private WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="dropdown")
    private WebElement dropdown;

    public void selectFromDropdown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
     List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
     return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void SelectMultipleAttribute(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, dropdown);
    }

    private Select findDropDownElement(){
        return new Select(dropdown);
    }

}
