package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage
{
    WebDriver driver;

    private final String topFrameName = "frame-top";
    private final String leftFrameName = "frame-left";
    private final String bottomFrameName ="frame-bottom";
    private final By leftFrameTextLocator = By.tagName("body");
    private final By bottomFrameTextLocator = By.tagName("body");

    public NestedFramesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getLeftFrameText()
    {
        switchToTopFrame();
        switchToLeftFrame();
        String leftFrameText = driver.findElement(leftFrameTextLocator).getText().trim();
        switchToMainArea();
        switchToMainArea();

        return leftFrameText;
    }

    public String getBottomFrameText()
    {
        switchToBottomFrame();
        String bottomFrameText = driver.findElement(bottomFrameTextLocator).getText().trim();
        switchToMainArea();

        return bottomFrameText;
    }


    private void switchToTopFrame()
    {
        driver.switchTo().frame(topFrameName);
    }

    private void switchToLeftFrame()
    {
        driver.switchTo().frame(leftFrameName);
    }

    private void switchToBottomFrame()
    {
        driver.switchTo().frame(bottomFrameName);
    }

    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }
}
