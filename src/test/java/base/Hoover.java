package base;
import org.testng.annotations.Test;
import pages.HoverPage;

public class Hoover extends BaseTests{

    @Test
    public void Hover(){

        HoverPage hover = homepage.OpenHoverPage();
        var caption = hover.hangOverFigure(1);
        System.out.println(caption.getTitle());
        caption.clickLink();
    }
}
