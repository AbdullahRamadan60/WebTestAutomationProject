package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTests extends BaseTests
{
    @Test
    public void testModal()
    {
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();

        Assert.assertTrue(entryAdPage.isModalDisplayed());
        Assert.assertEquals(entryAdPage.getModalTitle() , "THIS IS A MODAL WINDOW");
    }

    @Test
    public void testCloseModal()
    {
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();

        entryAdPage.closeModal();
        Assert.assertEquals(entryAdPage.getPageHeaderText() , "Entry Ad");
    }
}
