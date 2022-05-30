package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href=\"/login\"]")
    private WebElement loginForm;

    @FindBy(css="a[href=\"/dropdown\"]")
    private WebElement dropDown;

    @FindBy(css="a[href=\"/forgot_password\"]")
    private WebElement forgotPass;

    @FindBy(css="a[href=\"/hovers\"]")
    private WebElement hoverPage;

    @FindBy(css="a[href=\"/key_presses\"]")
    private WebElement keyPressPage;

    @FindBy (css="a[href=\"/horizontal_slider\"]")
    private WebElement sliderPage;

    @FindBy (css="a[href=\"/javascript_alerts\"]")
    private WebElement alertPage;

    @FindBy (css="a[href=\"/upload\"]")
    private WebElement fileUploadPage;

    @FindBy (css="a[href=\"/context_menu\"]")
    private WebElement contextPage;

    @FindBy (css="a[href=\"/tinymce\"]")
    private WebElement WyEditorPage;

    @FindBy (css= "a[href=\"/nested_frames\"]")
    private WebElement nestedFramesPage;

    @FindBy (css= "a[href=\"/dynamic_loading\"]")
    private WebElement dynamicLoadPage;

    @FindBy (css = "a[href=\"/large\"]")
    private WebElement largeDeepDomPage;

    @FindBy (css="a[href=\"/infinite_scroll\"]")
    private WebElement infiniteScrollPage;

    @FindBy (css= "a[href=\"/windows\"]")
    private WebElement multipleWindowsPage;


     public LoginPage OpenLoginPage(){
       loginForm.click();
       return new LoginPage(driver);
    }

     public DropdownPage OpenDropdownPage(){
         dropDown.click();
         return new DropdownPage(driver);
     }

     public ForgetpasswordPage OpenForgetPasswordPage(){
         forgotPass.click();
         return new ForgetpasswordPage(driver);
     }

     public HoverPage OpenHoverPage(){
         hoverPage.click();
         return new HoverPage(driver);
     }

     public KeyPressesPage OpenKeyPressesPage(){
         keyPressPage.click();
         return new KeyPressesPage(driver);
     }

     public HorizontalSliderPage OpenSliderPage(){
         sliderPage.click();
         return new HorizontalSliderPage(driver);
     }

     public JavaAlertPage OpenAlertPage(){
         alertPage.click();
         return new JavaAlertPage(driver);
     }

     public FileUploadPage OpenFileUploadPage(){
         fileUploadPage.click();
         return new FileUploadPage(driver);
     }

    public ContextMenuPage OpenContextPage(){
        contextPage.click();
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage OpenWysiwygEditorPage(){
         WyEditorPage.click();
         return new WysiwygEditorPage(driver);
    }

    public NestedFramePage OpenNestedFramesPage(){
         nestedFramesPage.click();
         return new NestedFramePage(driver);
    }

    public DynamicLoadingPage OpenDynamicLoadPage(){
        dynamicLoadPage.click();
        return new DynamicLoadingPage(driver);
     }

     public LargeDeepDomPage OpenDeepDomPage(){
         largeDeepDomPage.click();
         return new LargeDeepDomPage(driver);
     }

     public InfiniteScrollPage OpenInfinitePage(){
         infiniteScrollPage.click();
         return new InfiniteScrollPage(driver);
     }

     public MultipleWindowsPage OpenMultiplePage(){
         multipleWindowsPage.click();
         return new MultipleWindowsPage(driver);
     }



}
