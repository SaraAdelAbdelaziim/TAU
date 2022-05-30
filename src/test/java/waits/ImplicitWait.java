package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

        public WebDriver driver;
        protected HomePage homepage;

        @BeforeTest
        public void SetUp() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            directHome();
            homepage = new HomePage(driver);
        }

        @BeforeMethod
        public void directHome(){
            driver.get("https://the-internet.herokuapp.com/");
            driver.manage().window().maximize();

        }


        @AfterTest
        public void Close(){
            //driver.quit();
        }

        public static void main(String[] args) {
            base.BaseTests test = new base.BaseTests();
            test.SetUp();
        }
}


