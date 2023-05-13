package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FramesPage;
import pages.NestedFramesPage;


public class NestedFramesTests extends BaseTests
{
   @Test
    public void testNestedFrames()
   {
       NestedFramesPage nestedFramesPage = homePage.clickFramesLink().clickNestedFramesLink();

       SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(nestedFramesPage.getLeftFrameText() , "LEFT");
       softAssert.assertEquals(nestedFramesPage.getBottomFrameText() , "BOTTOM");
       softAssert.assertAll();

   }
}
