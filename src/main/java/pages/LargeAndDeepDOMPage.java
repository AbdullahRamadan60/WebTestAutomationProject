package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LargeAndDeepDOMPage
{
    WebDriver driver;

    private final By tableLocator = By.id("large-table");
    private final By tableHeaderLocator = By.tagName("thead");

    public LargeAndDeepDOMPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void scrollToTable()
    {
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(tableLocator));
        actions.perform();
    }

    public boolean isTableHeaderDisplayed()
    {
        return driver.findElement(tableHeaderLocator).isDisplayed();
    }

}
