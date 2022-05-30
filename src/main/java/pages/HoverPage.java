package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HoverPage {

    private WebDriver driver;
    private Actions action;

    public HoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        action = new Actions(driver);
    }

    @FindBy (className ="figure")
    private List<WebElement> figures;

    private By figureCaption = By.className("figcaption");

    /**
    * @param index starts at 1
      */
    public FigureCaption hangOverFigure(int index){
        WebElement fig = figures.get(index - 1);
        action.moveToElement(fig).perform();
        return new FigureCaption(fig.findElement(figureCaption));
    }

    public class FigureCaption{

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;

        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public void clickLink(){
            caption.findElement(link).click();
        }

        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }

}
