package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage
{
    private WebDriver driver;

    private final By flashLocator = By.id("flash");

    public SecureAreaPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getFlashMessage()
    {
        return driver.findElement(flashLocator).getText();
    }

}
