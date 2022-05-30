package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeDeepDomPage;

public class ScrollingDown extends BaseTests {

    @Test
    public void TestScrollingToVisibleItem(){
        LargeDeepDomPage largeDeep = homepage.OpenDeepDomPage();
        largeDeep.ScrollDownToTable();
    }

    @Test
    public void TestScrollingUntilVisible(){
        InfiniteScrollPage infinitePage = homepage.OpenInfinitePage();
        infinitePage.ScrollToParagraph(3);
    }


}
