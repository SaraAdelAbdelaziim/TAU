package alert;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenu extends BaseTests {

    @Test
    public void RightClickTest(){

        ContextMenuPage context = homepage.OpenContextPage();
        context.ClickTheBox();
        String text = context.alert_getMesg();
        context.alert_confirm();
        assertEquals(text , "You selected a context menu", "You did something wrong!");
    }
}
