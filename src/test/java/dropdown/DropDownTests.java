package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests
{
    @Test
    public void testSelectOption()
    {
        String selectedOption = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropDownLink();

        dropDownPage.selectOption(selectedOption);

        Assert.assertEquals(dropDownPage.getTheSelectedOptions().size() , 1);
        Assert.assertTrue(dropDownPage.getTheSelectedOptions().contains(selectedOption));

    }
}
