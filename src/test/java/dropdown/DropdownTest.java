package dropdown;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectedOption(){
        var dropdownPage = homepage.OpenDropdownPage();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
