package base;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCookies extends BaseTests{

    @Test
    public void DeleteCookie(){
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");


    }
}
