package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindoManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindoManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void GoForward(){
        navigate.forward();
    }
    public void GoBack(){
        navigate.back();
    }
    public void Refresh(){
        navigate.refresh();
    }
    public void GoTo(String URL){
        navigate.to(URL);
    }

    public void SwitchTabs(String Tab){
        var windows = driver.getWindowHandles();
        System.out.println("The number of tabs is :" +windows.size());

        System.out.println("Window handles : ");
        windows.forEach(System.out::println);

        for (String window : windows){
            System.out.println("Switching to :" +window);
            driver.switchTo().window(window);
            System.out.println("Current window title is:" + driver.getTitle() );
            if(Tab.equals(driver.getTitle())){
                break;
            }
        }

    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }


}
