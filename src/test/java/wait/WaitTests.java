package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

public class WaitTests extends BaseTests
{
    @Test
    public void testWaitUntilLoadingBarHideInExample1()
    {
        DynamicLoadingExample1Page dynamicLoadingExample1Page = homePage.clickDynamicLoadingLink().clickExample1Link();

        dynamicLoadingExample1Page.clickStartButton();

        Assert.assertEquals(dynamicLoadingExample1Page.getLoadedText() , "Hello World!");
    }

    @Test
    public void testWaitUntilLoadedTextVisibilityInExample2()
    {
        DynamicLoadingExample2Page dynamicLoadingExample2Page = homePage.clickDynamicLoadingLink().clickExample2Link();

        dynamicLoadingExample2Page.clickStartButton();

        Assert.assertEquals(dynamicLoadingExample2Page.getLoadedText() , "Hello World!");
    }
}
