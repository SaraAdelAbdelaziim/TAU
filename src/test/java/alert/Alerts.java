package alert;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaAlertPage;
import static org.testng.Assert.*;

public class Alerts extends BaseTests {

    @Test
    public void Test_JsAlert(){
        JavaAlertPage alertPage = homepage.OpenAlertPage();
        alertPage.alert_ClickOnJsAlert();
        String text = alertPage.alert_getText();
        alertPage.alert_accept();
        assertEquals(text, "I am a JS Alert","Alert text incorrect");
        assertEquals(alertPage.getText(), "You successfully clicked an alert", "Alert mesg incorrect");
    }

    @Test
    public void Test_JsConfirm_Accept(){

        JavaAlertPage alertPage = homepage.OpenAlertPage();
        alertPage.alert_ClickOnJsConfirm();
        String text= alertPage.alert_getText();
        alertPage.alert_accept();
        assertEquals(text, "I am a JS Confirm","Alert text incorrect");
        assertEquals(alertPage.getText(), "You clicked: Ok", "Alert mesg incorrect");

    }

    @Test
    public void Test_JsConfirm_Dismiss(){

        JavaAlertPage alertPage = homepage.OpenAlertPage();
        alertPage.alert_ClickOnJsConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_dismiss();
        assertEquals(text, "I am a JS Confirm","Alert text incorrect");
        assertEquals(alertPage.getText(), "You clicked: Cancel", "Alert mesg incorrect");
    }

    @Test
    public void Test_JsPrompt_Accept(){

        JavaAlertPage alertPage = homepage.OpenAlertPage();
        alertPage.alert_ClickOnJsPrompt();
        String EnteredData = "Great Job!";
        alertPage.alert_sendKeys(EnteredData);
        String text = alertPage.alert_getText();
        alertPage.alert_accept();
        assertEquals(text, "I am a JS prompt" ,"Alert text incorrect");
        assertEquals(alertPage.getText(), "You entered: "+EnteredData , "Alert mesg incorrect");

    }

    @Test
    public void Test_JsPrompt_Dismiss(){

        JavaAlertPage alertPage = homepage.OpenAlertPage();
        alertPage.alert_ClickOnJsPrompt();
        alertPage.alert_dismiss();
        assertEquals(alertPage.getText(), "You entered: null", "Alert mesg incorrect");
    }

}
