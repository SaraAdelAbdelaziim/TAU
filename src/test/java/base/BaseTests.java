package base;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.CookieManager;
import utils.WindoManager;
import java.io.File;
import java.io.IOException;


public class BaseTests {

    public WebDriver driver;
    protected HomePage homepage;

    @BeforeTest
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void directHome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }

    @AfterMethod
    public void RecordFailureTest(ITestResult result){

        if (ITestResult.FAILURE == result.getStatus()){
        var camera = (TakesScreenshot)driver;
        File ScreenShot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(ScreenShot, new File("resources/screenshots/" + result.getName() +".png")); }
            catch (IOException e ) {
                e.printStackTrace();}
        }

    }

    @AfterTest
    public void Close(){
        //driver.quit();
    }

    public WindoManager GetWindowManager(){
        return new WindoManager(driver);
    }

    public CookieManager getCookieManager(){
        return new CookieManager(driver);
    }



    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.SetUp();
    }
}
