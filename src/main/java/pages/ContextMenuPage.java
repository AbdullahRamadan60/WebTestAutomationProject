package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage
{
    WebDriver driver;

    private final By hotspotLocator = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void rightClickOnTheHotSpot()
    {
        WebElement hotSpotElement = driver.findElement(hotspotLocator);

        Actions actions = new Actions(driver);
        actions.contextClick(hotSpotElement);
        actions.perform();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void cancelAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText()
    {
        return driver.switchTo().alert().getText();
    }
}
