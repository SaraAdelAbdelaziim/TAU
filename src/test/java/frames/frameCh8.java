package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;
import static org.testng.Assert.*;

public class frameCh8 extends BaseTests {

    @Test
    public void frameTest1(){
        WysiwygEditorPage editor = homepage.OpenWysiwygEditorPage();
        String word1 = "Hello ";
        String word2 = "world!";

        editor.ClearTextArea();
        editor.SetTextArea(word1);
        editor.ClickDecreaseBtn();
        editor.SetTextArea(word2);

        assertEquals(editor.GetText(),word1 + word2, "Incorrect Text!");

    }
}
