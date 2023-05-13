package scroll;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDOMPage;

public class ScrollTests extends BaseTests
{
    @Test
    public void testDisplayingOfTableHeader()
    {
        LargeAndDeepDOMPage largeAndDeepDOMPage = homePage.clickLargeAndDeepDOMLink();

        largeAndDeepDOMPage.scrollToTable();

        Assert.assertTrue(largeAndDeepDOMPage.isTableHeaderDisplayed());
    }

    @Test
    public void infiniteScrollTestToParagraphNo5()
    {
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollLink();

        infiniteScrollPage.scrollToParagraphNo(5);

        Assert.assertTrue(infiniteScrollPage.isParagraphDisplayed(5));

    }
}
