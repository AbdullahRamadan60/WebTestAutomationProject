package contextMenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests
{
    @Test
    public void testRightClick()
    {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();

        contextMenuPage.rightClickOnTheHotSpot();

        Assert.assertEquals(contextMenuPage.getAlertText() , "You selected a context menu");

        contextMenuPage.acceptAlert();
    }

}
