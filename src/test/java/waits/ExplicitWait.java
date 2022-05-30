package waits;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadEx1Page;
import pages.DynamicLoadEx2Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.*;

public class ExplicitWait extends BaseTests {

    @Test
    public void TestEx1(){
        DynamicLoadingPage load = homepage.OpenDynamicLoadPage();
        DynamicLoadEx1Page loadEx1 = load.OpenEx1Page();
        loadEx1.ClickStartBtn();
        assertEquals(loadEx1.GetLoadedText(),"Hello World!");
    }

    @Test
    public void TestEx2(){
        DynamicLoadingPage load = homepage.OpenDynamicLoadPage();
        DynamicLoadEx2Page loadEx2 = load.OpenEx2Page();
        loadEx2.ClickStartBtn();
        assertEquals(loadEx2.GetLoadedText(),"Hello World!");
    }


}
