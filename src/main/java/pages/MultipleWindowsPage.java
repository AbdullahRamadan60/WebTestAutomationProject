package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage
{
    WebDriver driver;

    private final By clickHereLinkLocator = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickHere()
    {
        driver.findElement(clickHereLinkLocator).click();
    }




}
