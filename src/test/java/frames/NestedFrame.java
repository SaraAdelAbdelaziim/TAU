package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramePage;
import  static org.testng.Assert.*;

public class NestedFrame extends BaseTests {
    @Test
    public void TestNestedFrame(){
        NestedFramePage frame = homepage.OpenNestedFramesPage();
        String LeftFrameTxt = frame.GetTextLeftFrame();
        assertTrue(LeftFrameTxt.contains("LEFT"));

        assertTrue(frame.GetTextBottomFrame().contains("BOTTOM"));

    }
}


