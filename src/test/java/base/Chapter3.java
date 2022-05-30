package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.util.List;

public class Chapter3 {
    public WebDriver driver;
    public void setup(){
         System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://the-internet.herokuapp.com/");
         driver.manage().window().fullscreen();
         WebElement shifting = driver.findElement(By.cssSelector("a[href=\"/shifting_content\"]"));
         shifting.click();
         WebElement menu = driver.findElement(By.cssSelector("a[href=\"/shifting_content/menu\"]"));
         menu.click();
         List<WebElement> list = driver.findElements(By.tagName("li"));
         System.out.println("Total number of menu items: " +list.size());
         driver.quit();
    }

    public static void main(String[] args) {
        Chapter3 test = new Chapter3();
        test.setup();
     }
}