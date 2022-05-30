package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NavigationTest extends BaseTests {

    @Test
    public void TestNavigation(){
        homepage.OpenDynamicLoadPage().OpenEx1Page();
        GetWindowManager().GoBack();
        GetWindowManager().Refresh();
        GetWindowManager().GoForward();
        GetWindowManager().GoTo("https://www.google.com/");
    }

    @Test
    public void TestSwitchingTabs(){
        homepage.OpenMultiplePage().OpenNewTab();
        GetWindowManager().SwitchTabs("New Window");
    }

    @Test
    public void TestEx2Page(){
        var buttonPage = homepage.OpenDynamicLoadPage().OpenEx2Link();
        GetWindowManager().switchToNewTab();
        assertTrue(buttonPage.IsStartBtnVisible(),"Wrong Page");

    }

}
