package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class DynamicLoadingPage
{
    WebDriver driver;

    private final By example1LinkLocator = By.xpath("//a[contains(text(),'Example 1')]");
    private final By example2LinkLocator = By.xpath("//a[contains(text(),'Example 2')]");

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1Link()
    {
        driver.findElement(example1LinkLocator).click();

        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample1Page openExample1LinkInNewTab()
    {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(driver.findElement(example1LinkLocator))
                .build()
                .perform();

        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2Link()
    {
        driver.findElement(example2LinkLocator).click();

        return  new DynamicLoadingExample2Page(driver);
    }
}
