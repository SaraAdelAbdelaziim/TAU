package base;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class Slider extends BaseTests {

    @Test
    public void TestSlider() {

        HorizontalSliderPage sliderPage = homepage.OpenSliderPage();
        sliderPage.manageSlider("4");
        assertEquals(sliderPage.GetSliderText(), "4");

    }
}
