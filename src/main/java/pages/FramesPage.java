package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage
{
    WebDriver driver;

    private final By nestedFramesLink = By.cssSelector("li:nth-child(1) a");

    public FramesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesLink()
    {
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }


}
