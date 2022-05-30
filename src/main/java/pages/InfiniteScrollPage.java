package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (className="jscroll-added")
    private List<WebElement> Text;


    public void ScrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";  //Scroll as a user
        while (getNumberOfParagraphsPresent() < index){
            ((JavascriptExecutor)driver).executeScript(script);
        }
    }


    private int getNumberOfParagraphsPresent(){
        return Text.size();
    }

}
