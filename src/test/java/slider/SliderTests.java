package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SliderPage;

public class SliderTests extends BaseTests
{
    @Test
    public void testSliderMoveToNumber4()
    {
        SliderPage sliderPage = homePage.clickSliderLink();

        sliderPage.setTheSliderToNumber(4.0);

        Assert.assertEquals(sliderPage.geTheRangeNumber() , 4.0);
    }
}
