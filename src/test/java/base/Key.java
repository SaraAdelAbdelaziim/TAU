package base;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import org.openqa.selenium.Keys;

public class Key extends BaseTests {
    @Test
    public void sendKeyTest1(){

        KeyPressesPage keyPage = homepage.OpenKeyPressesPage();
        keyPage.EnterText("dsf" +(Keys.chord(Keys.SHIFT,"2"))); //chord: keep pressing the button and write
        System.out.println(keyPage.getMesg());

    }

    @Test
    public void sendKeyTest2(){

        KeyPressesPage keyPage = homepage.OpenKeyPressesPage();
        keyPage.EnterText("ab" + Keys.BACK_SPACE);
        assertEquals(keyPage.getMesg(),"You entered: BACK_SPACE");
    }
}
