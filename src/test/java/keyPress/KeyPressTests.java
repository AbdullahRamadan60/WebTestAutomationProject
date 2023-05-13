package keyPress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressPage;

public class KeyPressTests extends BaseTests
{
    @Test
    public void testBackSpace ()
    {
        KeyPressPage keyPressPage = homePage.clickKeyPressLink();

        keyPressPage.enterText("A" + Keys.BACK_SPACE);

        Assert.assertTrue(keyPressPage.getResult().contains("BACK_SPACE"));
    }

    @Test
    public void testPI()
    {
        KeyPressPage keyPressPage = homePage.clickKeyPressLink();
        keyPressPage.enterPI();

        Assert.assertEquals(keyPressPage.getFieldText() , "227");
    }
}
