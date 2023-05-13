package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTests
{
    @Test
    public void testNavigator()
    {
        homePage.clickDynamicLoadingLink().clickExample1Link();

        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab()
    {
        homePage.clickMultipleWindowsLink().clickHere();

        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchToExample1Tab()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();

        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.openExample1LinkInNewTab();

        getWindowManager().switchToTab(2);

        Assert.assertTrue(dynamicLoadingExample1Page.isStartButtonDisplayed());
    }

}
