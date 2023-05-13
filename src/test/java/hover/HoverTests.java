package hover;


import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HoverPage;

public class HoverTests extends BaseTests
{
    @Test
    public void testHoverUser1()
    {
        HoverPage hoverPage = homePage.clickHoverPageLink();

        HoverPage.FigureCaption figureCaption = hoverPage.hoverOnImageOfUsername("user1");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(figureCaption.isFigureCaptionDisplayed());
        softAssert.assertTrue(figureCaption.getNameHeaderText().contains("user1"));
        softAssert.assertEquals(figureCaption.getLinkText() , "View profile");
        softAssert.assertTrue(figureCaption.getLink().endsWith("/users/1"));
        softAssert.assertAll();
    }
}
