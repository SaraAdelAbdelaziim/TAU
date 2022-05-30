package javaScript;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import java.util.List;
import static org.testng.Assert.*;

public class dropdown extends BaseTests {

    @Test
    public void ChooseDropDown(){
        DropdownPage dropDown = homepage.OpenDropdownPage();
        dropDown.SelectMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDown:: selectFromDropdown);

        var selectedOptions = dropDown.getSelectedOption();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }



}
