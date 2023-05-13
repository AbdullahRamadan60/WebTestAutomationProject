package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage
{
    WebDriver driver;

    private final By sliderLocator = By.cssSelector("input[type='range']");
    private final By rangeNumLocator = By.id("range");

    public SliderPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setTheSliderToNumber(double number)
    {
        int numOfKeyPresses = (int) (number / 0.5);

        for(int i = 0 ; i < numOfKeyPresses ; i++)
        {
            driver.findElement(sliderLocator).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public double geTheRangeNumber()
    {
        return Float.parseFloat(driver.findElement(rangeNumLocator).getText());
    }

}
